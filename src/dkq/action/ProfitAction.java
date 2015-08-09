package dkq.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import ces.entity.DictShow;

import util.CopyrightUtil;
import util.ExcelUtil;
import util.PropertyUtil;

import dkq.entity.DictAdPrice;
import dkq.entity.IncomeDerivation;
import dkq.entity.SysMenu;
import dkq.service.DictAdPriceServiceI;
import dkq.service.IncomeDerivationServiceI;
import dkq.service.SysMenuServiceI;

@ParentPackage(value="basePackage")
@Namespace("/")
@Action(value="profitAction")
@Results(value = {
@Result(name ="profitlist", location = "/profit/profitlist.ftl"),
@Result(name ="cruploadresult", location = "/profit/upload_result.ftl"),

})
public class ProfitAction {
	private DictAdPriceServiceI dictAdPriceService;
	private DictAdPrice dictAdPrice = new DictAdPrice();
	private List<DictAdPrice> list = new ArrayList<DictAdPrice>();
	
	private IncomeDerivationServiceI incomeService;
	private IncomeDerivation income = new IncomeDerivation();
	private List<IncomeDerivation> incomelist = new ArrayList<IncomeDerivation>();
	Date dateTime = new Date();
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
	String dateTimes = df.format(dateTime);
	
	private String pageType;
	//上传
	private File uploadFile;  
	private String uploadFileFileName;  
	private String fileType;
	private String returnmsg="";
	List<IncomeDerivation> listobj=new ArrayList<IncomeDerivation>();
	
	public String profitlist(){
		list=dictAdPriceService.getList(dictAdPrice);
		incomelist=incomeService.getList(income);
		return "profitlist";
	}
	
	public String addprice(){
		int dictid=dictAdPrice.getId();
		
		dictAdPrice.setUpdateTime(dateTimes);
		if(dictid==0){
			dictAdPrice.setCreateTime(dateTimes);
			dictAdPriceService.addEntity(dictAdPrice);
		}else {
			dictAdPriceService.updateEntity(dictAdPrice);
		}
		return "profitlist";
	}
	
public String uploadfile() throws Exception{  
		ExcelUtil excelUtil = new ExcelUtil();
		ArrayList<ArrayList<String>> arrList = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(uploadFile);
			arrList = excelUtil.readExcel(fis);//调用excel模块的方法读取文件  返回要导入的数据
			//检查表头，如果表头有错直接返回，并提示修改
			String title = (new PropertyUtil()).getProperty(fileType);
			returnmsg=CopyrightUtil.checktitle(arrList,title);
			if(!returnmsg.equals("")){
				return "cruploadresult";
			}
			//提示内容，当内容有错，直接返回，提示修改意见，重新上传
			returnmsg=CopyrightUtil.checkcontent(arrList, title);
			if(!returnmsg.equals("")){
				return "cruploadresult";
			}
			listobj=getListObj(arrList);
			for(IncomeDerivation incomes:listobj){
				incomeService.addEntity(incomes);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			returnmsg="未找到文件";
		}
		returnmsg="上传添加成功";
        return "cruploadresult"; 
    }   
	
    public List<IncomeDerivation> getListObj(ArrayList<ArrayList<String>> list){
    	IncomeDerivation income = new IncomeDerivation();
    	for(int i=1; i < list.size(); ++i){
        	
        	income.setId(0);
        	income.setShowid((int)Double.parseDouble(list.get(i).get(0).trim()));
        	income.setShowName(list.get(i).get(1));
        	income.setChannelId(1);
        	income.setChannelName(list.get(i).get(2));
        	income.setStartTime(list.get(i).get(3));
        	income.setEndTime(list.get(i).get(4));
        	income.setIncome(Double.parseDouble(list.get(i).get(5).trim()));
        	income.setCreateTime(dateTimes);
        	income.setUpdateTime(dateTimes);
        	income.setSubUser("niuxiao");
        	listobj.add(income);
        }
    	return listobj;
    }
	
	
	@Autowired
	public void setDictAdPriceService(DictAdPriceServiceI dictAdPriceService) {
		this.dictAdPriceService = dictAdPriceService;
	}

	public DictAdPriceServiceI getDictAdPriceService() {
		return dictAdPriceService;
	}

	public DictAdPrice getDictAdPrice() {
		return dictAdPrice;
	}

	public void setDictAdPrice(DictAdPrice dictAdPrice) {
		this.dictAdPrice = dictAdPrice;
	}

	public List<DictAdPrice> getList() {
		return list;
	}

	public void setList(List<DictAdPrice> list) {
		this.list = list;
	}
	
	
	
	public IncomeDerivationServiceI getIncomeService() {
		return incomeService;
	}

	@Autowired
	public void setIncomeService(IncomeDerivationServiceI incomeService) {
		this.incomeService = incomeService;
	}

	public IncomeDerivation getIncome() {
		return income;
	}

	public void setIncome(IncomeDerivation income) {
		this.income = income;
	}

	public List<IncomeDerivation> getIncomelist() {
		return incomelist;
	}

	public void setIncomelist(List<IncomeDerivation> incomelist) {
		this.incomelist = incomelist;
	}

	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}

	public List<IncomeDerivation> getListobj() {
		return listobj;
	}

	public void setListobj(List<IncomeDerivation> listobj) {
		this.listobj = listobj;
	}

	
}
