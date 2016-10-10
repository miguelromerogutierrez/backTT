package alert.amber.app.model.form.out;

import alert.amber.app.model.dto.BulletinDto;

public class BulletinInfoFormDtoOut {
	private BulletinDto bulletinDto;
	private byte[] image;
	
	public BulletinDto getBulletinDto() {
		return bulletinDto;
	}
	public void setBulletinDto(BulletinDto bulletinDto) {
		this.bulletinDto = bulletinDto;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
}
