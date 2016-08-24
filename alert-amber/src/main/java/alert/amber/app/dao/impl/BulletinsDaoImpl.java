package alert.amber.app.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import alert.amber.app.dao.AbstractDao;
import alert.amber.app.dao.BulletinsDao;
import alert.amber.app.mappers.BulletinMapper;
import alert.amber.app.model.dto.BulletinDto;
import alert.amber.app.model.entities.BulletinEntity;

@Repository("bulletinsDao")
public class BulletinsDaoImpl extends AbstractDao<Integer, BulletinEntity> implements BulletinsDao {

	@Override
	public BulletinEntity findBulletinById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveBulletin(BulletinDto bulletinDto) {
		persist(BulletinMapper.mapBulletinDtoToBulletinEntity(bulletinDto));
	}

	@Override
	public void deleteBulletin(BulletinDto bulletinDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BulletinDto> findAllBulletins() {
		// TODO Auto-generated method stub
		return null;
	}

}
