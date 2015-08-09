package happyfind.action;

import happyfind.entity.BorrowInformation;
import happyfind.entity.SystemLog;
import happyfind.service.BorrowInformationServiceI;
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
@Result(name ="borrow", location = "/manger/borrowInfoList.ftl"),
@Result(name ="update", location = "/manger/addBorrow.ftl"),
@Result(name ="addBorrow", location = "/manger/addBorrow.ftl"),


})
public class MangerAction {
	
	//参数
	private String pageName;
	private int borrowId;
	private BorrowInformation bf = new BorrowInformation();
	private BorrowInformationServiceI borrowInformationService;
	
	private SystemLog log = new SystemLog();
	private SystemLogServiceI systemLogService;
	
	//数据列表
	List<BorrowInformation> borrowlist=new ArrayList<BorrowInformation>();
	//时间参数
	Date dateTime = new Date();
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
	String dateTimes = df.format(dateTime);
	
	public String toPageList(){
		borrowlist=borrowInformationService.getList(bf);
		return pageName;
	}
	public String toPage(){
		if(pageName.equals("update")){
			bf=borrowInformationService.getEntityById(borrowId);
		}
		return pageName;
	}
	public String addBorrow(){
		bf.setUpdateTime(dateTimes);
		String logKey=CommonData.ADDBORROW;
		if(bf.getId()==0){
			borrowInformationService.addEntity(bf);
			systemLogService.addEntity(log);
		}else{
			logKey=CommonData.UPDATEBORROW;
			borrowInformationService.updateEntity(bf);
		}
		log=getLogDate(bf.getModuser(),logKey,bf.getIdCard());
		return pageName;
	}
	
	public void deleteBorrow(){
		bf.setUpdateTime(dateTimes);
		bf.setDeleteFlag("1");
		bf.setId(borrowId);
		borrowInformationService.deleteEntity(bf);
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

	public BorrowInformationServiceI getBorrowInformationService() {
		return borrowInformationService;
	}
	
	@Autowired
	public void setBorrowInformationService(
			BorrowInformationServiceI borrowInformationService) {
		this.borrowInformationService = borrowInformationService;
	}

	public List<BorrowInformation> getBorrowlist() {
		return borrowlist;
	}

	public void setBorrowlist(List<BorrowInformation> borrowlist) {
		this.borrowlist = borrowlist;
	}

	public BorrowInformation getBf() {
		return bf;
	}

	public void setBf(BorrowInformation bf) {
		this.bf = bf;
	}
	public int getBorrowId() {
		return borrowId;
	}
	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
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
