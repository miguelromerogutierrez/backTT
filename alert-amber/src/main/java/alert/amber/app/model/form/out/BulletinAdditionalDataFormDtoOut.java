package alert.amber.app.model.form.out;

import alert.amber.app.enums.ColourEyeEnum;
import alert.amber.app.enums.ColourSkinEnum;
import alert.amber.app.model.form.shared.NationalityFormDto;
import alert.amber.app.model.form.shared.TransformFormDto;

public class BulletinAdditionalDataFormDtoOut {
	private NationalityFormDto nationality;
	private String colourHair;
	private ColourSkinEnum colourSkin;
	private ColourEyeEnum colourEye;
	private TransformFormDto height;
	private TransformFormDto weight;
	private String signs;
	
	public NationalityFormDto getNationality() {
		return nationality;
	}
	public void setNationality(NationalityFormDto nationality) {
		this.nationality = nationality;
	}
	public String getColourHair() {
		return colourHair;
	}
	public void setColourHair(String colourHair) {
		this.colourHair = colourHair;
	}
	public ColourSkinEnum getColourSkin() {
		return colourSkin;
	}
	public void setColourSkin(ColourSkinEnum colourSkin) {
		this.colourSkin = colourSkin;
	}
	public ColourEyeEnum getColourEye() {
		return colourEye;
	}
	public void setColourEye(ColourEyeEnum colourEye) {
		this.colourEye = colourEye;
	}
	public TransformFormDto getHeight() {
		return height;
	}
	public void setHeight(TransformFormDto height) {
		this.height = height;
	}
	public TransformFormDto getWeight() {
		return weight;
	}
	public void setWeight(TransformFormDto weight) {
		this.weight = weight;
	}
	public String getSigns() {
		return signs;
	}
	public void setSigns(String signs) {
		this.signs = signs;
	}
}
