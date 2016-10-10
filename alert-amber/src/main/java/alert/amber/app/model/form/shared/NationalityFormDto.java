package alert.amber.app.model.form.shared;

public class NationalityFormDto {
	private String nationality;
	private int code;
	
	public NationalityFormDto() {}
	public NationalityFormDto(int code, String nationality) {
		this.code = code;
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
