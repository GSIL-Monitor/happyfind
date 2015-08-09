package util;

import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {

	Properties props = new Properties();
    
	public void init(){
		InputStream in;
		try {
			in = getClass().getResourceAsStream(
					"/common.properties");
			props.load(in);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		if (props.isEmpty()) {
			System.out.print("commonConfig.properties is null");
		}
	}
	
	public String getProperty(String key)
	{
		init();
		String value = props.get(key).toString();
		return value;
	}
	
}
