package alert.amber.app.model.form.shared;

public class PlaceFormDto {
	private double latitude;
	private double longitue;
	
	public PlaceFormDto() {}
	
	public PlaceFormDto(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitue = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitue() {
		return longitue;
	}
	public void setLongitue(double longitue) {
		this.longitue = longitue;
	}
}
