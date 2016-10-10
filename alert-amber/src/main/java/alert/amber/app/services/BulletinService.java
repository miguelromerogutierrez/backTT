package alert.amber.app.services;

import java.util.List;

import alert.amber.app.model.dto.BulletinDto;
import alert.amber.app.model.form.out.SimpleBulletinFormDtoOut;

public interface BulletinService {
	void saveBulletin(BulletinDto bulletinDto);
	List<BulletinDto> getBulletins();
	BulletinDto getBulletinById(String id);
}
