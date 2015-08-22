package happyview.action;

import happyfind.entity.SystemLog;
import happyview.entity.ReleaseInformation;
import happyview.service.ReleaseInformationServiceI;
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
@Action(value="releaseAction")
@Results(value = {
@Result(name ="addRelase", location = "/view/addRelease.ftl"),
})
public class ReleaseAction {
	
	//参数
	private String pageName;
	private int rewardId;
	private ReleaseInformation release = new ReleaseInformation();
	private ReleaseInformationServiceI releaseInformationService;
	
	private SystemLog log = new SystemLog();
	private SystemLogServiceI systemLogService;
	
	//数据列表
	List<ReleaseInformation> releaselist=new ArrayList<ReleaseInformation>();
	//时间参数
	Date dateTime = new Date();
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
	String dateTimes = df.format(dateTime);
	
	public String toPageList(){
		releaselist=releaseInformationService.getList(release);
		return pageName;
	}
	public String toPage(){
		return pageName;
	}
	
	public String addRelease(){
		release.setUpdateTime(dateTimes);
		String logKey=CommonData.ADDRELEASE;
		if(release.getId()==0){
			release.setModtime(dateTimes);
			releaseInformationService.addEntity(release);
			systemLogService.addEntity(log);
		}else{
			logKey=CommonData.UPDATERELEASE;
			releaseInformationService.updateEntity(release);
		}
		log=getLogDate(release.getModuser(),logKey,release.getIdCard());
		return pageName;
	}
	
	public void deleteBorrow(){
		release.setUpdateTime(dateTimes);
		release.setDeleteFlag(1);
		release.setId(rewardId);
		releaseInformationService.deleteEntity(release);
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

	
	public int getRewardId() {
		return rewardId;
	}
	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}
	public ReleaseInformation getRelease() {
		return release;
	}
	public void setRelease(ReleaseInformation release) {
		this.release = release;
	}
	public ReleaseInformationServiceI getReleaseInformationService() {
		return releaseInformationService;
	}
	public void setReleaseInformationService(
			ReleaseInformationServiceI releaseInformationService) {
		this.releaseInformationService = releaseInformationService;
	}
	public List<ReleaseInformation> getReleaselist() {
		return releaselist;
	}
	public void setReleaselist(List<ReleaseInformation> releaselist) {
		this.releaselist = releaselist;
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
