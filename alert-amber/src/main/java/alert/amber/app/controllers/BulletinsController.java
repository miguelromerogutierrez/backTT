package alert.amber.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import alert.amber.app.mappers.BulletinMapper;
import alert.amber.app.model.dto.BulletinDto;
import alert.amber.app.model.form.ResponseMessageFormDto;
import alert.amber.app.model.form.out.BulletinBasicDataFormDtoOut;
import alert.amber.app.services.BulletinService;

@RestController
public class BulletinsController {

	private BulletinDto bulletin;
	
//	@Autowired
//	private BulletinService bulletinService;
	
	@ResponseBody
	@RequestMapping(value = "/api/bulletins/add/data/basic", method = RequestMethod.POST)
	public ResponseMessageFormDto appendBasicData(@RequestBody final BulletinBasicDataFormDtoOut bulletinBasicDataFormDtoOut) {
		BulletinMapper.appendBasicDataToBulletinDto(bulletinBasicDataFormDtoOut, bulletin);
		return new ResponseMessageFormDto();
	}
	
	@ResponseBody
	@RequestMapping(value = "/api/bulletins/add", method = RequestMethod.POST)
	public ResponseMessageFormDto addBulletin(@RequestBody final BulletinBasicDataFormDtoOut bulletinFormDto) {
		
		if(bulletinFormDto.getName() != null) {
			
		}
		
		ResponseMessageFormDto okHttpResponse = new ResponseMessageFormDto();
		okHttpResponse.setMessage("Todo biens!!");
		return okHttpResponse;
	}
	
}
