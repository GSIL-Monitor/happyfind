package happyview.action;

import happyview.entity.FindPeopleInformation;
import happyview.entity.GetRewardInformation;
import happyfind.entity.SystemLog;
import happyview.service.FindPeopleInformationServiceImpl;
import happyview.service.FindPeopleInformationServiceI;
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
@Action(value="FindPeopleAction")
@Results(value = {
@Result(name ="FindPeople", location = "/view/FindPeopleList.ftl"),
@Result(name ="addFindPeople", location = "/view/addFindPeople.ftl"),
@Result(name ="update", location = "/view/updateFindPeople.ftl"),
})
public class FindPeopleAction {
	
	//参数
	private String pageName;
	private int id;
	private FindPeopleInformation fp = new FindPeopleInformation();
	private FindPeopleInformationServiceI FindPeopleInformationService;
	
	private SystemLog log = new SystemLog();
	private SystemLogServiceI systemLogService;
	
	//数据列表
	List<FindPeopleInformation> FindPeoplelist=new ArrayList<FindPeopleInformation>();
	//时间参数
	Date dateTime = new Date();
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
	String dateTimes = df.format(dateTime);
	
	public String toPageList(){
		FindPeoplelist=FindPeopleInformationService.getList(fp);
		return pageName;
	}
	public String toPage(){
		if(pageName.equals("update")){
			fp=FindPeopleInformationService.getEntityById(id);
		}
		return "addFindPeople";
	}
	public String addFindPeople(){
		fp.setUpdateTime(dateTimes);
		String logKey=CommonData.ADDFINDPEOPLE;
		if(fp.getId()==0){
			FindPeopleInformationService.addEntity(fp);
			systemLogService.addEntity(log);
		}else{
			logKey=CommonData.UPDATEREWARD;
			FindPeopleInformationService.updateEntity(fp);
		}
		log=getLogDate(fp.getModuser(),logKey,String.valueOf(fp.getId()));
		
		return pageName;
	}
	
	public void deleteFindPeople(){
		fp.setUpdateTime(dateTimes);
		fp.setDeleteFlag("1");
		fp.setId(id);
		FindPeopleInformationService.deleteEntity(fp);
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

	public FindPeopleInformationServiceI FindPeopleInformationService() {
		return FindPeopleInformationService;
	}
	
	@Autowired
	public void setFindPeopleInformationService(
			FindPeopleInformationServiceI FindPeopleInformationService) {
		this.FindPeopleInformationService = FindPeopleInformationService;
	}

	public List<FindPeopleInformation> getFindPeoplelist() {
		return FindPeoplelist;
	}

	public void setFindPeoplelist(List<FindPeopleInformation> FindPeoplelist) {
		this.FindPeoplelist = FindPeoplelist;
	}

	public FindPeopleInformation getFp() {
		return fp;
	}

	public void setFp(FindPeopleInformation fp) {
		this.fp = fp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
