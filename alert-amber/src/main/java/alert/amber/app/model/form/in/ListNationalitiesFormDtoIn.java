package alert.amber.app.model.form.in;

import java.util.List;

import alert.amber.app.model.form.shared.NationalityFormDto;

public class ListNationalitiesFormDtoIn {
	List<NationalityFormDto> nationalities;

	public List<NationalityFormDto> getNationalities() {
		return nationalities;
	}

	public void setNationalities(List<NationalityFormDto> nationalities) {
		this.nationalities = nationalities;
	}
	
}
