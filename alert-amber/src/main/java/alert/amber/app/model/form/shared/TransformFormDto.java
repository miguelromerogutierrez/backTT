package alert.amber.app.model.form.shared;

public class TransformFormDto {
	private String value;
	private int code;
	
	public TransformFormDto() { }
	
	public TransformFormDto(int code,String value) {
		this.value = value;
		this.code = code;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
