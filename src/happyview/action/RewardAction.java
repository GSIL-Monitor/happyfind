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
@Action(value="RewardAction")
@Results(value = {
@Result(name ="reward", location = "/view/rewardList.ftl"),
@Result(name ="addReward", location = "/view/addReward.ftl"),
})
public class RewardAction {
	
	//参数
	private String pageName;
	private int rewardId;
	private RewardInformation rf = new RewardInformation();
	private RewardInformationServiceI RewardInformationService;
	
	private SystemLog log = new SystemLog();
	private SystemLogServiceI systemLogService;
	
	//数据列表
	List<RewardInformation> rewardlist=new ArrayList<RewardInformation>();
	//时间参数
	Date dateTime = new Date();
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
	String dateTimes = df.format(dateTime);
	
	public String toPageList(){
		rewardlist=RewardInformationService.getList(rf);
		return pageName;
	}
	public String toPage(){
		if(pageName.equals("update")){
			rf=RewardInformationService.getEntityById(rewardId);
		}
		return pageName;
	}
	public String addReward(){
		rf.setUpdateTime(dateTimes);
		String logKey=CommonData.ADDREWARD;
		if(rf.getId()==0){
			RewardInformationService.addEntity(rf);
			systemLogService.addEntity(log);
		}else{
			logKey=CommonData.UPDATEREWARD;
			RewardInformationService.updateEntity(rf);
		}
		log=getLogDate(rf.getModuser(),logKey,rf.getIdCard());
		
		return pageName;
	}
	
	public void deleteReward(){
		rf.setUpdateTime(dateTimes);
		rf.setDeleteFlag("1");
		rf.setId(rewardId);
		RewardInformationService.deleteEntity(rf);
	}

	public SystemLog getLogDate(String LogUser,String logType,String logKey){
		log.setDateTime(dateTimes);
		log.setLogUser(LogUser);
		log.setLogType(logType);
		log.setLogkey(CommonData.getLogKey(logKey));
		return log;
	}
	
	
	
	
	
	
	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public RewardInformationServiceI getRewardInformationService() {
		return RewardInformationService;
	}
	
	@Autowired
	public void setRewardInformationService(
			RewardInformationServiceI RewardInformationService) {
		this.RewardInformationService = RewardInformationService;
	}

	public List<RewardInformation> getRewardlist() {
		return rewardlist;
	}

	public void setRewardlist(List<RewardInformation> rewardlist) {
		this.rewardlist = rewardlist;
	}

	public RewardInformation getRf() {
		return rf;
	}

	public void setRf(RewardInformation rf) {
		this.rf = rf;
	}
	public int getrewardId() {
		return rewardId;
	}
	public void setrewardId(int rewardId) {
		this.rewardId = rewardId;
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
	
	
	
}
