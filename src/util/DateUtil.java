package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String Date2String(Date date,String formate)
	{

		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		
		if(date !=null){
		return	sdf.format(date);
		}
		return "";
	}
	
	public static boolean CheckDateformate(String datestr,String formate)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		
		if(datestr!=null){
				try {
					Date d = sdf.parse(datestr);
				} catch (ParseException e) {
					return false;
				}
			}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(CheckDateformate("2014-10-13","yyyy-MM-dd"));
	}
}
