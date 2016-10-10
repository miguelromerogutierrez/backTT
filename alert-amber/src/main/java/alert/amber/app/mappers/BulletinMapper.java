package alert.amber.app.mappers;

import alert.amber.app.model.dto.BulletinDto;
import alert.amber.app.model.entities.BulletinEntity;
import alert.amber.app.model.form.out.BulletinBasicDataFormDtoOut;
import alert.amber.app.model.form.shared.NationalityFormDto;
import alert.amber.app.model.form.shared.PlaceFormDto;
import alert.amber.app.model.form.shared.TransformFormDto;
import alert.amber.app.utils.EnumsTransform;

public class BulletinMapper {
	
	public static BulletinEntity mapBulletinDtoToBulletinEntity(BulletinDto dto){
		BulletinEntity entity = new BulletinEntity();
		
		entity.setId(dto.getBulletinCode());
		entity.setName(dto.getName());
		entity.setLastName(dto.getLastName());
		entity.setSecodLastName(dto.getSecondLastName());
		entity.setAge(dto.getAge());
		entity.setBirthday(dto.getBirthday());
		entity.setGender(dto.getGender().toString());
		entity.setHeight(dto.getHeight().getValue());
		entity.setWeight(dto.getWeight().getValue());
		entity.setNationality(dto.getNationality().getNationality());
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
	
	public static BulletinDto mapBulletinEntityToBulletinDto(BulletinEntity entity) {
		BulletinDto dto = new BulletinDto();
		NationalityFormDto nationalityFormDto = new NationalityFormDto();
		nationalityFormDto.setNationality(entity.getNationality());
		
		dto.setAge(entity.getAge());
		dto.setBirthday(entity.getBirthday());
		dto.setBulletinCode(entity.getId());
		dto.setColourEye(EnumsTransform.getEyeColorEnum(entity.getColourEye()));
		dto.setColourHair(entity.getColourHair());
		dto.setColourSkin(EnumsTransform.getColourSkinEnum(entity.getColourSkin()));
		dto.setFactsDate(entity.getFactsDate());
		dto.setGender(EnumsTransform.getGenderEnum(entity.getGender()));
		dto.setHeight(new TransformFormDto(0, entity.getHeight()));
		dto.setLastName(entity.getLastName());
		dto.setName(entity.getName());
		dto.setNationality(nationalityFormDto);
		dto.setPlace(new PlaceFormDto(entity.getLatitude(), entity.getLongitude()));
		dto.setSecondLastName(entity.getSecodLastName());
		dto.setSigns(entity.getSigns());
		dto.setWeight(new TransformFormDto(0, entity.getWeight()));
		
		return dto;
	}
	
	public static BulletinDto mapBulletinEntityToBulletinSimple(BulletinEntity entity) {
		BulletinDto dto = new BulletinDto();
		NationalityFormDto nationalityFormDto = new NationalityFormDto();
		nationalityFormDto.setNationality(entity.getNationality());
		
		dto.setAge(entity.getAge());
		dto.setBirthday(entity.getBirthday());
		dto.setBulletinCode(entity.getId());
		dto.setColourEye(EnumsTransform.getEyeColorEnum(entity.getColourEye()));
		dto.setColourHair(entity.getColourHair());
		dto.setColourSkin(EnumsTransform.getColourSkinEnum(entity.getColourSkin()));
		dto.setFactsDate(entity.getFactsDate());
		dto.setGender(EnumsTransform.getGenderEnum(entity.getGender()));
		dto.setHeight(new TransformFormDto(0, entity.getHeight()));
		dto.setLastName(entity.getLastName());
		dto.setName(entity.getName());
		dto.setNationality(nationalityFormDto);
		dto.setPlace(new PlaceFormDto(entity.getLatitude(), entity.getLongitude()));
		dto.setSecondLastName(entity.getSecodLastName());
		dto.setSigns(entity.getSigns());
		dto.setWeight(new TransformFormDto(0, entity.getWeight()));
		
		return dto;
	}

}
