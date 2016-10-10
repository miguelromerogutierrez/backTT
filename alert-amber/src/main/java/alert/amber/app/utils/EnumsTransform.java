package alert.amber.app.utils;

import alert.amber.app.enums.ColourEyeEnum;
import alert.amber.app.enums.ColourSkinEnum;
import alert.amber.app.enums.GenderEnum;

public class EnumsTransform {
	
	public static ColourEyeEnum  getEyeColorEnum(String eyeColorString) {
		ColourEyeEnum colour = ColourEyeEnum.BLACK;
		if (eyeColorString.equals(ColourEyeEnum.BLACK.toString())) {
			colour = ColourEyeEnum.BLACK;
		} else if(eyeColorString.equals(ColourEyeEnum.BLUE.toString())) {
			colour = ColourEyeEnum.BLUE;
		} else if(eyeColorString.equals(ColourEyeEnum.BROWN.toString())) {
			colour = ColourEyeEnum.BROWN;
		} else if(eyeColorString.equals(ColourEyeEnum.GRAY.toString())) {
			colour = ColourEyeEnum.GRAY;
		} else if(eyeColorString.equals(ColourEyeEnum.GREEN.toString())) {
			colour = ColourEyeEnum.GREEN;
		}
		
		return colour;
	}
	
	public static ColourSkinEnum getColourSkinEnum (String colourSkinString) {
		ColourSkinEnum colourSkinEnum = ColourSkinEnum.DARK;
		if (colourSkinString.equals(ColourSkinEnum.DARK.toString())) {
			colourSkinEnum = ColourSkinEnum.DARK;
		} else if (colourSkinString.equals(ColourSkinEnum.FAIR.toString())) {
			colourSkinEnum = ColourSkinEnum.FAIR;
		} else if (colourSkinString.equals(ColourSkinEnum.MEDIUM.toString())) {
			colourSkinEnum = ColourSkinEnum.MEDIUM;
		} else if (colourSkinString.equals(ColourSkinEnum.OLIVE.toString())) {
			colourSkinEnum = ColourSkinEnum.OLIVE;
		}
		
		return colourSkinEnum;
	}
	
	public static GenderEnum getGenderEnum (String genderString) {
		GenderEnum gender = GenderEnum.FEMALE;
		if (genderString.equals(GenderEnum.FEMALE.toString())) {
			gender = GenderEnum.FEMALE;
		} else if(genderString.equals(GenderEnum.MALE.toString())) {
			gender = GenderEnum.MALE;
		}
		return gender;
	}
}
