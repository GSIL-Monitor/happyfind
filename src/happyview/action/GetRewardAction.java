package happyview.action;

import happyview.entity.RewardInformation;
import happyview.entity.GetRewardInformation;
import happyfind.entity.SystemLog;
import happyview.service.RewardInformationServiceI;
import happyview.service.GetRewardInformationServiceI;
import happyfind.service.SystemLogServiceI;
import happyfind.utils.CommonData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

@ParentPackage(value="basePackage")
@Namespace("/")
@Action(value="GetRewardAction")
@Results(value = {
@Result(name ="getreward", location = "/view/GetRewardList.ftl"),
@Result(name ="addgetReward", location = "/view/addGetReward.ftl"),
})
public class GetRewardAction {
	
	//参数
	private String pageName;
	private int getrewardId;
	private int rewardId;
	private GetRewardInformation grf = new GetRewardInformation();
	private GetRewardInformationServiceI GetRewardInformationService;
	
	private SystemLog log = new SystemLog();
	private SystemLogServiceI systemLogService;
	
	//数据列表
	List<GetRewardInformation> getrewardlist=new ArrayList<GetRewardInformation>();
	//时间参数
	Date dateTime = new Date();
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
	String dateTimes = df.format(dateTime);
	
	public String toPageList(){
		getrewardlist=GetRewardInformationService.getList(grf);
		return pageName;
	}
	public String toPage(){
		if(pageName.equals("update")){
			grf=GetRewardInformationService.getEntityById(getrewardId);
		}
		return pageName;
	}
	public String addGetReward(){
		grf.setUpdateTime(dateTimes);
		String logKey=CommonData.ADDGETREWARD;
		if(grf.getId()==0){
			GetRewardInformationService.addEntity(grf);
		}else{
			logKey=CommonData.UPDATEGETREWARD;
			GetRewardInformationService.updateEntity(grf);
		}
		log=getLogDate(grf.getModuser(),logKey,String.valueOf(grf.getId()));
		//systemLogService.addEntity(log);
		return pageName;
	}
	
	public void deleteGetReward(){
		grf.setUpdateTime(dateTimes);
		grf.setDeleteFlag("1");
		grf.setId(getrewardId);
		GetRewardInformationService.deleteEntity(grf);
	}

	public SystemLog getLogDate(String LogUser,String logType,String logKey){
		log.setDateTime(dateTimes);
		log.setLogUser(LogUser);
		log.setLogType(logType);
		log.setLogkey(logKey);
		return log;
	}
	
	
	
	
	
	
	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public GetRewardInformationServiceI getGetRewardInformationService() {
		return GetRewardInformationService;
	}
	
	@Autowired
	public void setGetRewardInformationService(
			GetRewardInformationServiceI GetRewardInformationService) {
		this.GetRewardInformationService = GetRewardInformationService;
	}

	public List<GetRewardInformation> getRewardlist() {
		return getrewardlist;
	}

	public void setGetRewardlist(List<GetRewardInformation> getrewardlist) {
		this.getrewardlist = getrewardlist;
	}


	public GetRewardInformation getGrf() {
		return grf;
	}
	public void setGrf(GetRewardInformation grf) {
		this.grf = grf;
	}

	public List<GetRewardInformation> getGetrewardlist() {
		return getrewardlist;
	}
	public void setGetrewardlist(List<GetRewardInformation> getrewardlist) {
		this.getrewardlist = getrewardlist;
	}
	public SystemLog getLog() {
		return log;
	}
	public void setLog(SystemLog log) {
		this.log = log;
	}
	public SystemLogServiceI getSystemLogService() {
		return systemLogService;
	}
	public void setSystemLogService(SystemLogServiceI systemLogService) {
		this.systemLogService = systemLogService;
	}
	public int getRewardId() {
		return rewardId;
	}
	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}
	
	
	
}
