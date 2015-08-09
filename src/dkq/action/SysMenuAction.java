package dkq.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import dkq.entity.SysMenu;
import dkq.service.SysMenuServiceI;

@ParentPackage(value="basePackage")
@Namespace("/")
@Action(value="menuAction")
@Results(value = {
@Result(name ="addpage", location = "/sys/menuAdd.ftl"),
@Result(name ="updatepage", location = "/sys/menuUpdate.ftl"),
@Result(name ="list", location = "/sys/menuList.ftl"),
})
public class SysMenuAction {
	private SysMenuServiceI sysMenuService;
	private SysMenu menu = new SysMenu();
	private String id="";
	private List<SysMenu> list = new ArrayList<SysMenu>();
	
	public String addpage()
	{
		int lever=1;
		list = sysMenuService.getParentList(lever);
		return "addpage";
	}
	
	public String updatepage(){
		
		menu.setMenuid(12);
		menu = sysMenuService.getEntityByid(menu.getMenuid());
		
		return "updatepage";
	}
	
	public String updateMenu()
	{
		sysMenuService.updateEntity(menu);
		
		list = sysMenuService.getList(menu);
		
		return list();
	}
	
	public String addMenu(){
		
		if(menu.getParentid()==0)
		{
			menu.setLever(1);
		}else
		{
			menu.setLever(2);
		}
		sysMenuService.addEntity(menu);
		
		return list();
	}
	public String list(){
		
		list = sysMenuService.getList(menu);
		
		return "list";
	}
	
	public String getMenuRole(){
		
		list = sysMenuService.getMenuRole(id);
		
		return "list";
	}
	
	
	public String delete()
	{
		sysMenuService.delEntity(id);
		return list();
	}
	
	@Autowired
	public void setSysMenuService(SysMenuServiceI sysMenuService) {
		this.sysMenuService = sysMenuService;
	}

	public SysMenuServiceI getSysMenuService() {
		return sysMenuService;
	}

	public SysMenu getMenu() {
		return menu;
	}

	public void setMenu(SysMenu menu) {
		this.menu = menu;
	}

	public List<SysMenu> getList() {
		return list;
	}

	public void setList(List<SysMenu> list) {
		this.list = list;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
