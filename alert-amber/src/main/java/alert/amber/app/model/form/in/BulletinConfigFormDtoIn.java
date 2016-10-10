package alert.amber.app.model.form.in;

import java.util.List;

import alert.amber.app.model.form.shared.NationalityFormDto;
import alert.amber.app.model.form.shared.TransformFormDto;

public class BulletinConfigFormDtoIn {
	private String bulletinCode;
	private long ageRangeMin;
	private long ageRangeMax;
	private List<NationalityFormDto> nationalities;
	private long factsDateRangeMin;
	private long factsDateRangeMax;
	
	public String getBulletinCode() {
		return bulletinCode;
	}
	public void setBulletinCode(String bulletinCode) {
		this.bulletinCode = bulletinCode;
	}
	public long getAgeRangeMin() {
		return ageRangeMin;
	}
	public void setAgeRangeMin(long ageRangeMin) {
		this.ageRangeMin = ageRangeMin;
	}
	public long getAgeRangeMax() {
		return ageRangeMax;
	}
	public void setAgeRangeMax(long ageRangeMax) {
		this.ageRangeMax = ageRangeMax;
	}
	public List<NationalityFormDto> getNationalities() {
		return nationalities;
	}
	public void setNationalities(List<NationalityFormDto> nationalities) {
		this.nationalities = nationalities;
	}
	public long getFactsDateRangeMin() {
		return factsDateRangeMin;
	}
	public void setFactsDateRangeMin(long factsDateRangeMin) {
		this.factsDateRangeMin = factsDateRangeMin;
	}
	public long getFactsDateRangeMax() {
		return factsDateRangeMax;
	}
	public void setFactsDateRangeMax(long factsDateRangeMax) {
		this.factsDateRangeMax = factsDateRangeMax;
	}
}
