package happyfind.utils;

public class CommonData {
	public static final String ADDBORROW="addBorrow" ;
	public static final String UPDATEBORROW="updateBorrow" ;
	
	public static String getLogKey(String key){
		String keyValue=null;
		if(key.equals("addBorrow")){
			keyValue="添加信贷信息";
		}else if(key.equals("updateBorrow")){
			keyValue="修改信贷信息";
		}
		return keyValue;
	}
}
