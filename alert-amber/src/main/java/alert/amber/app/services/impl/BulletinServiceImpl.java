package alert.amber.app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import alert.amber.app.dao.BulletinsDao;
import alert.amber.app.model.dto.BulletinDto;
import alert.amber.app.services.BulletinService;

@Service("bulletinService")
@Transactional
public class BulletinServiceImpl implements BulletinService {

	@Autowired
	private BulletinsDao bulletinDao;

	@Override
	public void saveBulletin(BulletinDto bulletinDto) {
		bulletinDao.saveBulletin(bulletinDto);
	}

}
