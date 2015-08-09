package ces.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import ces.entity.Roverview;
import ces.service.ReportServiceI;

@ParentPackage(value="basePackage")
@Namespace("/")
@Action(value="rpAction")
@Results(value = {
@Result(name ="addpage", location = "/copyright/addpage.ftl"),
@Result(name ="updatepage", location = "/copyright/updatepage.ftl"),
@Result(name ="main", location = "/cesreport/main.ftl"),
@Result(name ="overview", location = "/cesreport/overview.ftl"),
@Result(name ="traffic", location = "/cesreport/traffic.ftl"),
@Result(name ="function", location = "/cesreport/function.ftl"),
@Result(name ="profit", location = "/cesreport/profit.ftl"),
})
public class ReportAction {
	
	//参数
	String siteid;
	String page;
	String showids;
	
	String showname;
	
	ReportServiceI reportService;
	
	//数据列表
	List<Roverview> roverviewlist=new ArrayList<Roverview>();
	
	public String main(){
		
		return "main";
	}
	
	public String showinfo()
	{
		
		return "";
	}
	public String report()
	{
		
		roverviewlist=reportService.getList(null);
		
		
		return page;
	}

	public String getSiteid() {
		return siteid;
	}

	public void setSiteid(String siteid) {
		this.siteid = siteid;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getShowids() {
		return showids;
	}

	public void setShowids(String showids) {
		this.showids = showids;
	}

	public List<Roverview> getRoverviewlist() {
		return roverviewlist;
	}

	public void setRoverviewlist(List<Roverview> roverviewlist) {
		this.roverviewlist = roverviewlist;
	}

	@Autowired
	public void setReportService(ReportServiceI reportService) {
		this.reportService = reportService;
	}
	
	public String getShowname() {
		return showname;
	}
	public void setShowname(String showname) {
		this.showname = showname;
	}
	
	
}
