package alert.amber.app.model.form.in;

import java.util.List;

import alert.amber.app.model.form.out.BulletinInfoFormDtoOut;

public class ListBulletinsFormDtoIn {
	List<BulletinInfoFormDtoOut> bulletins;

	public List<BulletinInfoFormDtoOut> getBulletins() {
		return bulletins;
	}

	public void setBulletins(List<BulletinInfoFormDtoOut> bulletins) {
		this.bulletins = bulletins;
	}
	
}
