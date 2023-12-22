package com.sr.config;

import org.aeonbits.owner.Config;
import org.openqa.selenium.remote.BrowserType;

import com.github.dockerjava.api.model.PortConfigProtocol;

import converters.StringToBrowserTypeConverter;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties"
	
})

public interface FrameworkConfig extends Config {
	
	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserTypeConverter.class)
	
	   //@Key("env")
	   
	  
	//BrowserType() br
	com.sr.enums.BrowserType browser();
	String url();
	

}
