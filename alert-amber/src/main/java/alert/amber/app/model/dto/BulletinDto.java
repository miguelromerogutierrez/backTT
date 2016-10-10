package alert.amber.app.model.dto;

import alert.amber.app.enums.ColourEyeEnum;
import alert.amber.app.enums.ColourSkinEnum;
import alert.amber.app.enums.GenderEnum;
import alert.amber.app.model.form.shared.NationalityFormDto;
import alert.amber.app.model.form.shared.PlaceFormDto;
import alert.amber.app.model.form.shared.TransformFormDto;

public class BulletinDto {
	
	private String bulletinCode;
	private String name;
	private String lastName;
	private String secondLastName;
	private long birthday;
	private String age;
	private GenderEnum gender;
	private NationalityFormDto nationality;
	private String colourHair;
	private ColourSkinEnum colourSkin;
	private ColourEyeEnum colourEye;
	private TransformFormDto height;
	private TransformFormDto weight;
	private String signs;
	private long factsDate;
	private PlaceFormDto place;
	
	
	public String getBulletinCode() {
		return bulletinCode;
	}
	public void setBulletinCode(String bulletinCode) {
		this.bulletinCode = bulletinCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSecondLastName() {
		return secondLastName;
	}
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}
	public long getBirthday() {
		return birthday;
	}
	public void setBirthday(long birthday) {
		this.birthday = birthday;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public GenderEnum getGender() {
		return gender;
	}
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}
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
	public long getFactsDate() {
		return factsDate;
	}
	public void setFactsDate(long factsDate) {
		this.factsDate = factsDate;
	}
	public PlaceFormDto getPlace() {
		return place;
	}
	public void setPlace(PlaceFormDto place) {
		this.place = place;
	}
}
