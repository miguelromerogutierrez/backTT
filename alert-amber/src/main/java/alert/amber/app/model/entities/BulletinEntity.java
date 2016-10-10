package alert.amber.app.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AMBER_BULLETINS")
public class BulletinEntity {

	@Id
	@Column(name="AMBER_ID_BULLETIN")
	private String id;
	
	@Column(name="AMBER_NAME_BULLETIN")
	private String name;
	
	@Column(name="AMBER_LAST_NAME_BULLETIN")
	private String lastName;
	
	@Column(name="AMBER_SECOND_LAST_NAME_BULLETIN")
	private String secodLastName;
	
	@Column(name="AMBER_BIRTHDAY_BULLETIN")
	private long birthday;
	
	@Column(name="AMBER_AGE_BULLETIN")
	private String age;
	
	@Column(name="AMBER_GENDER_BULLETIN")
	private String gender;
	
	@Column(name="AMBER_NATIONALITY_BULLETIN")
	private String nationality;
	
	@Column(name="AMBER_COLOUR_HAIR_BULLETIN")
	private String colourHair;
	
	@Column(name="AMBER_COLOUR_SKIN_BULLETIN")
	private String colourSkin;
	
	@Column(name="AMBER_COLOUR_EYE_BULLETIN")
	private String colourEye;
	
	@Column(name="AMBER_HEIGHT_BULLETIN")
	private String height;
	
	@Column(name="AMBER_WEIGHT_BULLETIN")
	private String weight;
	
	@Column(name="AMBER_DATE_FACTS_BULLETIN")
	private long factsDate;
	
	@Column(name="AMBER_PLACE_LONGITUDE_BULLETIN")
	private double longitude;
	
	@Column(name="AMBER_PLACE_LATITUDE_BULLETIN")
	private double latitude;
	
	@Column(name="AMBER_SIGNS_BULLETIN")
	private String signs;

	@Override
	public String toString() {
		return "BulletinEntity [id=" + id + ", name=" + name + ", lastName=" + lastName + ", secodLastName="
				+ secodLastName + ", birthday=" + birthday + ", age=" + age + ", gender=" + gender + ", nationality="
				+ nationality + ", colourHair=" + colourHair + ", colourSkin=" + colourSkin + ", colourEye=" + colourEye
				+ ", height=" + height + ", weight=" + weight + ", factsDate=" + factsDate + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", signs=" + signs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BulletinEntity other = (BulletinEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getSecodLastName() {
		return secodLastName;
	}

	public void setSecodLastName(String secodLastName) {
		this.secodLastName = secodLastName;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getColourHair() {
		return colourHair;
	}

	public void setColourHair(String colourHair) {
		this.colourHair = colourHair;
	}

	public String getColourSkin() {
		return colourSkin;
	}

	public void setColourSkin(String colourSkin) {
		this.colourSkin = colourSkin;
	}

	public String getColourEye() {
		return colourEye;
	}

	public void setColourEye(String colourEye) {
		this.colourEye = colourEye;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
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

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
}
