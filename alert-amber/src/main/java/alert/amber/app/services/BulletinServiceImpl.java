package alert.amber.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import alert.amber.app.dao.BulletinsDao;
import alert.amber.app.mappers.BulletinMapper;
import alert.amber.app.model.dto.BulletinDto;
import alert.amber.app.model.entities.BulletinEntity;
import alert.amber.app.model.form.out.SimpleBulletinFormDtoOut;

@Service("bulletinService")
@Transactional
public class BulletinServiceImpl implements BulletinService {

	@Autowired
	private BulletinsDao bulletinDao;

	@Override
	public void saveBulletin(BulletinDto bulletinDto) {
		bulletinDao.saveBulletin(bulletinDto);
	}

	@Override
	public List<BulletinDto> getBulletins() {
		List<BulletinEntity> bulletinsEntity = bulletinDao.findAllBulletins();
		List<BulletinDto> bulletinsDto = new ArrayList<>();
		for (BulletinEntity bulletinEntity : bulletinsEntity) {
			bulletinsDto.add(BulletinMapper.mapBulletinEntityToBulletinDto(bulletinEntity));
		}
		return bulletinsDto;
	}

	@Override
	public BulletinDto getBulletinById(String id) {
		bulletinDao.findBulletinById(id);
		return null;
	}

}
