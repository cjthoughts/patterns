package com.chan.pattern.pp.plugin;



import java.io.FileInputStream;
import java.util.Properties;

import com.chan.pattern.pp.parser.IParser;

public class PluginFactory {

	private static Properties props = new Properties();
	
	static{
		try{
			//String propsFile = System.getProperty("config.properties");
			props.load(new FileInputStream("C:\\Users\\bbailey\\Documents\\plugin-pattern\\patterns\\plugin-pattern\\src\\main\\resources\\config.properties"));
		}catch(Exception e){
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static IParser getPlugin(String id){
		String className = props.getProperty(id);
		if(className == null)
			throw new RuntimeException("Implementation is not specified for "+ className + " in pliginFactory properties");
		
		try{
			return (IParser) Class.forName(className).newInstance();
		}catch(Exception e){
			throw new RuntimeException("factory unable to construct instance of "+className);
		}
		
	}

}
