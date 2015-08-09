package ces.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import util.CopyrightUtil;
import util.ExcelUtil;
import util.PropertyUtil;
import ces.entity.DictShow;
import ces.service.DictShowServiceI;

@ParentPackage(value="basePackage")
@Namespace("/")
@Action(value="crAction")
@Results(value = {
@Result(name ="addpage", location = "/copyright/addpage.ftl"),
@Result(name ="updatepage", location = "/copyright/updatepage.ftl"),
@Result(name ="cruploadpage", location = "/copyright/copyright_upload.ftl"),
@Result(name ="cruploadresult", location = "/copyright/copyright_upload_result.ftl"),
@Result(name ="listmain", location = "/copyright/listmain.ftl"),
@Result(name ="tv", location = "/copyright/copyright_tv.ftl"),
@Result(name ="movie", location = "/copyright/copyright_movie.ftl"),
@Result(name ="variety", location = "/copyright/copyright_variety.ftl"),
@Result(name ="cartoon", location = "/copyright/copyright_cartoon.ftl"),
})
public class CopyrightAction {
	
	private DictShowServiceI dictShowService;
	
	private String id = "";
	private String channel = "";
	private String returnmsg="";
	
	private File uploadFile;  
	
	private String uploadFileFileName;  
	
	DictShow dictShow=new DictShow();
	
	private List<DictShow> list = new ArrayList<DictShow>();
	
	public String addpage()
	{
		return "addpage";
	}

	public String updatepage(){
		
		
		return "updatepage";
	}
	
	public String cruploadpage(){
		
		
		return "cruploadpage";
	}
	
	public String listmain(){
		
		return "listmain";
	}
	
	public String update()
	{
		dictShowService.updateEntity(dictShow);
		return list();
	}
	
	public String delete()
	{
		
		dictShowService.delEntity(id);
		return list();
	}

	public String uploadfile() throws Exception{  
		
		ExcelUtil excelUtil = new ExcelUtil();
		
		ArrayList<ArrayList<String>> arrList = null;
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(uploadFile);
			
			arrList = excelUtil.readExcel(fis);//调用excel模块的方法读取文件  返回要导入的数据
			
			//检查表头，如果表头有错直接返回，并提示修改
			
			String title = (new PropertyUtil()).getProperty(channel);
			
			returnmsg=CopyrightUtil.checktitle(arrList,title);
			
			if(!returnmsg.equals("")){
				return "cruploadresult";
			}
			//提示内容，当内容有错，直接返回，提示修改意见，重新上传
			returnmsg=CopyrightUtil.checkcontent(arrList, title);
			if(!returnmsg.equals("")){
				
				return "cruploadresult";
			}
			
			dictShowService.uploadfileAdd(arrList,channel);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			returnmsg="未找到文件";
		}
		returnmsg="上传添加成功";
		
        return "cruploadresult";  
    }  
	
	public String add(){
		dictShow.setAnalyst_owner("zhongzhiqun");
		dictShow.setAnalyst_type("1");
		dictShow.setUp_date("20150701");
		dictShow.setDown_date("20150710");
		dictShow.setShow_name("aasdfasd");
		dictShow.setShowid("123456");
		dictShow.setSite_id("1");
		dictShow.setStat("1");
		dictShow.setEpisode("20");
		dictShow.setUrl("url");
		dictShow.setChannel_id("a");
		dictShow.setAnalyst_owner("aa");
		
		dictShowService.addEntity(dictShow);
		return list();
	}
	
	public String list(){
		
		list = dictShowService.getList(dictShow);
		
		if(channel==null||channel.equals(""))
		{
			return "tv";
		}else{
			return channel;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<DictShow> getList() {
		return list;
	}

	public void setList(List<DictShow> list) {
		this.list = list;
	}

	public DictShowServiceI getDictShowService() {
		return dictShowService;
	}

	@Autowired
	public void setDictShowService(DictShowServiceI dictShowService) {
		this.dictShowService = dictShowService;
	}

	public DictShow getDictShow() {
		return dictShow;
	}

	public void setDictShow(DictShow dictShow) {
		this.dictShow = dictShow;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
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

	public String getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}
	
	
	
}
