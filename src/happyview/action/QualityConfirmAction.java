package happyview.action;

import happyview.entity.QualityConfirmInformation;
import happyview.entity.GetRewardInformation;
import happyfind.entity.SystemLog;
import happyview.service.QualityConfirmInformationServiceImpl;
import happyview.service.QualityConfirmInformationServiceI;
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
@Action(value="QualityConfirmAction")
@Results(value = {
@Result(name ="QualityConfirm", location = "/view/QualityConfirmList.ftl"),
@Result(name ="addQualityConfirm", location = "/view/addQualityConfirm.ftl"),
@Result(name ="update", location = "/view/updateQualityConfirm.ftl"),
})
public class QualityConfirmAction {
	
	//参数
	private String pageName;
	private int id;
	private QualityConfirmInformation qc = new QualityConfirmInformation();
	private QualityConfirmInformationServiceI QualityConfirmInformationService;
	
	private SystemLog log = new SystemLog();
	private SystemLogServiceI systemLogService;
	
	//数据列表
	List<QualityConfirmInformation> QualityConfirmlist=new ArrayList<QualityConfirmInformation>();
	//时间参数
	Date dateTime = new Date();
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
	String dateTimes = df.format(dateTime);
	
	public String toPageList(){
		QualityConfirmlist=QualityConfirmInformationService.getList(qc);
		return pageName;
	}
	public String toPage(){
		if(pageName.equals("update")){
			qc=QualityConfirmInformationService.getEntityById(id);
		}
		return "addQualityConfirm";
	}
	public String addQualityConfirm(){
		qc.setUpdateTime(dateTimes);
		String logKey=CommonData.ADDRIGHTDEBT;
		if(qc.getId()==0){
			QualityConfirmInformationService.addEntity(qc);
			systemLogService.addEntity(log);
		}else{
			logKey=CommonData.UPDATEREWARD;
			QualityConfirmInformationService.updateEntity(qc);
		}
		log=getLogDate(qc.getModuser(),logKey,String.valueOf(qc.getId()));
		
		return pageName;
	}
	
	public void deleteQualityConfirm(){
		qc.setUpdateTime(dateTimes);
		qc.setDeleteFlag("1");
		qc.setId(id);
		QualityConfirmInformationService.deleteEntity(qc);
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

	public QualityConfirmInformationServiceI QualityConfirmInformationService() {
		return QualityConfirmInformationService;
	}
	
	@Autowired
	public void setQualityConfirmInformationService(
			QualityConfirmInformationServiceI QualityConfirmInformationService) {
		this.QualityConfirmInformationService = QualityConfirmInformationService;
	}

	public List<QualityConfirmInformation> getQualityConfirmlist() {
		return QualityConfirmlist;
	}

	public void setQualityConfirmlist(List<QualityConfirmInformation> QualityConfirmlist) {
		this.QualityConfirmlist = QualityConfirmlist;
	}

	public QualityConfirmInformation getQc() {
		return qc;
	}

	public void setQc(QualityConfirmInformation qc) {
		this.qc = qc;
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
