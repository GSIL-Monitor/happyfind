package happyfind.utils;

public class CommonData {
	public static final String ADDBORROW="addBorrow" ;
	public static final String UPDATEBORROW="updateBorrow" ;
	public static final String ADDREWARD="addReward" ;
	public static final String UPDATEREWARD="updateReward" ;
	public static final String ADDRELEASE="addRelease" ;
	public static final String UPDATERELEASE="updateRelease" ;
	public static final String ADDGETREWARD="addGetReward" ;
	public static final String UPDATEGETREWARD="updateGetReward" ;
	public static final String ADDFINDPEOPLE="addFindPeople" ;
	public static final String UPDATEFINDPEOPLE="updateFindPeople" ;
	public static final String ADDRIGHTDEBT="addRightDebt" ;
	public static final String UPDATERIGHTDEBT="updateRightDebt" ;
	
	public static String getLogKey(String key){
		String keyValue=null;
		if(key.equals("addBorrow")){
			keyValue="添加信贷信息";
		}else if(key.equals("updateBorrow")){
			keyValue="修改信贷信息";
		}else if(key.equals("addReward")){
			keyValue="添加悬赏信息";
		}else if(key.equals("updateReward")){
			keyValue="修改悬赏信息";
		}else if(key.equals("addRelease")){
			keyValue="增加举报信息";
		}else if(key.equals("updateRelease")){
			keyValue="修改举报信息";
		}else if(key.equals("addGetReward")){
			keyValue="增加领赏信息";
		}else if(key.equals("updateGetReward")){
			keyValue="修改领赏信息";
		}else if(key.equals("addFindPeople")){
			keyValue="增加寻人信息";
		}else if(key.equals("updateFindPeople")){
			keyValue="修改寻人信息";
		}else if(key.equals("addRightDebt")){
			keyValue="增加竞价定价信息";
		}else if(key.equals("updateRightDebt")){
			keyValue="修改竞价定价信息";
		}
		return keyValue;
	}
}
