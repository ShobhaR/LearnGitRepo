package converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.sr.enums.BrowserType;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {
	
	@Override
	public BrowserType convert(Method method, String browserName) {
		
	Map<String,BrowserType> map =	Map.of("CHROME",BrowserType.CHROME,"FIREFOX",BrowserType.FIREFOX);
		// TODO Auto-generated method stub
		return map.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
		
		
	}

}
