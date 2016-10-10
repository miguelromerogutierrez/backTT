package alert.amber.app.controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import alert.amber.app.model.dto.BulletinDto;
import alert.amber.app.model.form.ResponseMessageFormDto;
import alert.amber.app.model.form.in.BulletinConfigFormDtoIn;
import alert.amber.app.model.form.in.ListBulletinsFormDtoIn;
import alert.amber.app.model.form.out.BulletinBasicDataFormDtoOut;
import alert.amber.app.model.form.out.BulletinInfoFormDtoOut;
import alert.amber.app.model.form.shared.NationalityFormDto;
import alert.amber.app.services.BulletinService;
import alert.amber.app.utils.SessionIdentifierGenerator;

@RestController
public class BulletinsController {

	private final String BASE_PATH = "/api/bulletins";
	
	@Autowired
	private BulletinService bulletinService;
	
	@ResponseBody
	@RequestMapping(value = BASE_PATH + "/add/image", method = RequestMethod.POST)
	public ResponseMessageFormDto uploadBulletinImage(@RequestParam("bulletinCode") final String bulletinCode,
			@RequestParam("image") MultipartFile file) {
		
		ResponseMessageFormDto response = new ResponseMessageFormDto();
		
		if (!file.isEmpty()) {
			try{
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				
				if (!dir.exists())
					dir.mkdirs();
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + bulletinCode + ".png");
				BufferedImage src = ImageIO.read(new ByteArrayInputStream(file.getBytes()));
				ImageIO.write(src, "png", serverFile);

				response.setMessage("success");
			} catch(IOException e) {
				response.setMessage("wrong");
			}
		}
		
		return response;
	}
	
	
	@ResponseBody
	@RequestMapping(value = BASE_PATH + "/add/data", method = RequestMethod.POST)
	public ResponseMessageFormDto setBulletinData(@RequestBody final BulletinDto bulletinDto) {
		bulletinService.saveBulletin(bulletinDto);
		return new ResponseMessageFormDto();
	}
	
	@ResponseBody
	@RequestMapping(value = BASE_PATH + "/list", method = RequestMethod.GET)
	public ListBulletinsFormDtoIn getBulletins() {
		ListBulletinsFormDtoIn listBulletinsFormDtoIn = new ListBulletinsFormDtoIn();
		List<BulletinDto> bulletinsList = bulletinService.getBulletins();
		List<BulletinInfoFormDtoOut> bulletinInfoFormDtoOuts = new ArrayList<>();
		for(BulletinDto bulletin : bulletinsList) {
			BulletinInfoFormDtoOut bulletinInfoFormDtoOut = new BulletinInfoFormDtoOut();
			bulletinInfoFormDtoOut.setBulletinDto(bulletin);
			bulletinInfoFormDtoOut.setImage(getImage(bulletin.getBulletinCode()));
			bulletinInfoFormDtoOuts.add(bulletinInfoFormDtoOut);
		}
		listBulletinsFormDtoIn.setBulletins(bulletinInfoFormDtoOuts);
		return listBulletinsFormDtoIn;
	}
	
	@ResponseBody
	@RequestMapping(value = BASE_PATH + "/retrieve/initial/data", method = RequestMethod.GET)
	public BulletinConfigFormDtoIn retrieveInitialData () {
		BulletinConfigFormDtoIn bulletinConfigFormDtoIn = new BulletinConfigFormDtoIn();
		List<NationalityFormDto> nationalities = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
		nationalities.add(new NationalityFormDto(1, "MEXICO"));
		nationalities.add(new NationalityFormDto(2, "ESTADOS UNIDOS"));
		nationalities.add(new NationalityFormDto(3, "COLOMBIA"));
		nationalities.add(new NationalityFormDto(4, "VENEZUELA"));
		nationalities.add(new NationalityFormDto(5, "ARGENTINA"));
		bulletinConfigFormDtoIn.setBulletinCode(new SessionIdentifierGenerator().nextSessionId());
		bulletinConfigFormDtoIn.setNationalities(nationalities);
		bulletinConfigFormDtoIn.setAgeRangeMax(calendar.getTimeInMillis());
		bulletinConfigFormDtoIn.setFactsDateRangeMax(calendar.getTimeInMillis());
		bulletinConfigFormDtoIn.setFactsDateRangeMin(calendar.getTimeInMillis()-604800000);
		calendar.set(calendar.get(Calendar.YEAR) - 18, 0, 1, 0, 0);
		bulletinConfigFormDtoIn.setAgeRangeMin(calendar.getTimeInMillis());
		
		return bulletinConfigFormDtoIn;
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
	
	private byte[] getImage(String id) {
		try{
			String rootPath = System.getProperty("catalina.home");
			String imagePath = rootPath + File.separator + "tmpFiles" + File.separator + id + ".png";
			InputStream is = new FileInputStream(imagePath);
			byte[] imgBytes = null;
			if(is != null) {
				ByteArrayOutputStream bao = new ByteArrayOutputStream();
				BufferedImage img = ImageIO.read(is);
				ImageIO.write(img, "png", bao);
				imgBytes = bao.toByteArray();
			}
			return imgBytes;
		} catch(IOException e) {
			
		}
		return null;
	}
	
}
