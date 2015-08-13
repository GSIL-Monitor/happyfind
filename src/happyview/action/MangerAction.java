package happyview.action;

import happyview.entity.RewardInformation;
import happyfind.entity.SystemLog;
import happyview.service.RewardInformationServiceI;
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
@Action(value="mangerAction")
@Results(value = {
@Result(name ="reward", location = "/manger/rewardInfoList.ftl"),
@Result(name ="update", location = "/manger/addReward.ftl"),
@Result(name ="addReward", location = "/manger/addReward.ftl"),


})
public class MangerAction {
	
	//参数
	private String pageName;
	private int rewardId;
	private RewardInformation bf = new RewardInformation();
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
		rewardlist=RewardInformationService.getList(bf);
		return pageName;
	}
	public String toPage(){
		if(pageName.equals("update")){
			bf=RewardInformationService.getEntityById(rewardId);
		}
		return pageName;
	}
	public String addReward(){
		bf.setUpdateTime(dateTimes);
		String logKey=CommonData.ADDREWARD;
		if(bf.getId()==0){
			RewardInformationService.addEntity(bf);
			systemLogService.addEntity(log);
		}else{
			logKey=CommonData.UPDATEBORROW;
			RewardInformationService.updateEntity(bf);
		}
		log=getLogDate(bf.getModuser(),logKey,bf.getIdCard());
		return pageName;
	}
	
	public void deleteBorrow(){
		bf.setUpdateTime(dateTimes);
		bf.setDeleteFlag("1");
		bf.setId(rewardId);
		RewardInformationService.deleteEntity(bf);
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

	public void setBorrowlist(List<RewardInformation> rewardlist) {
		this.rewardlist = rewardlist;
	}

	public RewardInformation getBf() {
		return bf;
	}

	public void setBf(RewardInformation bf) {
		this.bf = bf;
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
