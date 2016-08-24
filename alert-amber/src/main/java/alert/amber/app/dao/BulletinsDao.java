package alert.amber.app.dao;

import java.util.List;

import alert.amber.app.model.dto.BulletinDto;
import alert.amber.app.model.entities.BulletinEntity;

public interface BulletinsDao {
	BulletinEntity findBulletinById(int id);
	void saveBulletin(BulletinDto bulletinDto);
	void deleteBulletin(BulletinDto bulletinDto);
	List<BulletinDto> findAllBulletins();
}
