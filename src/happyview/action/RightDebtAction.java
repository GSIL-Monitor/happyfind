package happyview.action;

import happyview.entity.RightDebtInformation;
import happyview.entity.GetRewardInformation;
import happyfind.entity.SystemLog;
import happyview.service.RightDebtInformationServiceImpl;
import happyview.service.RightDebtInformationServiceI;
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
@Action(value="RightDebtAction")
@Results(value = {
@Result(name ="RightDebt", location = "/view/RightDebtList.ftl"),
@Result(name ="addRightDebt", location = "/view/addRightDebt.ftl"),
@Result(name ="update", location = "/view/updateRightDebt.ftl"),
})
public class RightDebtAction {
	
	//参数
	private String pageName;
	private int id;
	private RightDebtInformation rd = new RightDebtInformation();
	private RightDebtInformationServiceI RightDebtInformationService;
	
	private SystemLog log = new SystemLog();
	private SystemLogServiceI systemLogService;
	
	//数据列表
	List<RightDebtInformation> RightDebtlist=new ArrayList<RightDebtInformation>();
	//时间参数
	Date dateTime = new Date();
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
	String dateTimes = df.format(dateTime);
	
	public String toPageList(){
		RightDebtlist=RightDebtInformationService.getList(rd);
		return pageName;
	}
	public String toPage(){
		if(pageName.equals("update")){
			rd=RightDebtInformationService.getEntityById(id);
		}
		return "addRightDebt";
	}
	public String addRightDebt(){
		rd.setUpdateTime(dateTimes);
		String logKey=CommonData.ADDRIGHTDEBT;
		if(rd.getId()==0){
			RightDebtInformationService.addEntity(rd);
			systemLogService.addEntity(log);
		}else{
			logKey=CommonData.UPDATEREWARD;
			RightDebtInformationService.updateEntity(rd);
		}
		log=getLogDate(rd.getModuser(),logKey,String.valueOf(rd.getId()));
		
		return pageName;
	}
	
	public void deleteRightDebt(){
		rd.setUpdateTime(dateTimes);
		rd.setDeleteFlag("1");
		rd.setId(id);
		RightDebtInformationService.deleteEntity(rd);
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

	public RightDebtInformationServiceI RightDebtInformationService() {
		return RightDebtInformationService;
	}
	
	@Autowired
	public void setRightDebtInformationService(
			RightDebtInformationServiceI RightDebtInformationService) {
		this.RightDebtInformationService = RightDebtInformationService;
	}

	public List<RightDebtInformation> getRightDebtlist() {
		return RightDebtlist;
	}

	public void setRightDebtlist(List<RightDebtInformation> RightDebtlist) {
		this.RightDebtlist = RightDebtlist;
	}

	public RightDebtInformation getFp() {
		return rd;
	}

	public void setFp(RightDebtInformation rd) {
		this.rd = rd;
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
