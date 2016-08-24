package alert.amber.app.mappers;

import alert.amber.app.model.dto.BulletinDto;
import alert.amber.app.model.entities.BulletinEntity;
import alert.amber.app.model.form.out.BulletinBasicDataFormDtoOut;

public class BulletinMapper {
	
	public static BulletinEntity mapBulletinDtoToBulletinEntity(BulletinDto dto){
		BulletinEntity entity = new BulletinEntity();
		
		entity.setName(dto.getName());
		entity.setLastName(dto.getLastName());
		entity.setSecodLastName(dto.getSecondLastName());
		entity.setAge(dto.getAge());
		entity.setBirthday(dto.getBirthday());
		entity.setGender(dto.getGender().toString());
		entity.setHeight(dto.getHeight().getValue());
		entity.setWeight(dto.getWeight().getValue());
		entity.setNationality(dto.getNationality().getCode());
		entity.setColourEye(dto.getColourEye().toString());
		entity.setColourHair(dto.getColourHair());
		entity.setColourSkin(dto.getColourSkin().toString());
		entity.setSigns(dto.getSigns());
		entity.setFactsDate(dto.getFactsDate());
		entity.setLongitude(dto.getPlace().getLongitue());
		entity.setLatitude(dto.getPlace().getLatitude());
		
		return entity;
	}
	
	public static void appendBasicDataToBulletinDto(BulletinBasicDataFormDtoOut from, BulletinDto to) {
		to.setName(from.getName());
		to.setLastName(from.getLastName());
		to.setSecondLastName(from.getSecondLastName());
		to.setAge(from.getAge());
		to.setGender(from.getGender());
		to.setBirthday(from.getBirthday());
	}

}
