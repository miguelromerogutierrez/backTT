package alert.amber.app.model.form.out;

import alert.amber.app.enums.GenderEnum;
import alert.amber.app.model.form.shared.PlaceFormDto;

public class SimpleBulletinFormDtoOut {
    private String bulletinCode;
    private String name;
    private String lastName;
    private String secondLastName;
    private long factsDate;
    private PlaceFormDto place;
    private String age;
    private GenderEnum gender;

    public String getBulletinCode() {
        return bulletinCode;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public long getFactsDate() {
        return factsDate;
    }

    public PlaceFormDto getPlace() {
        return place;
    }

    public String getAge() {
        return age;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setBulletinCode(String bulletinCode) {
        this.bulletinCode = bulletinCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public void setFactsDate(long factsDate) {
        this.factsDate = factsDate;
    }

    public void setPlace(PlaceFormDto place) {
        this.place = place;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }
}

