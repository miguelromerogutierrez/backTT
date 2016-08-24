package alert.amber.app.model.form;

import org.springframework.http.HttpStatus;

public class ResponseMessageFormDto {

	private HttpStatus httpStatus;
	private String message;
	
	public ResponseMessageFormDto () {
		httpStatus = HttpStatus.OK;
		message = "";
	}
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
