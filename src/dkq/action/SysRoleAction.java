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
import dkq.entity.SysRole;
import dkq.service.SysMenuServiceI;
import dkq.service.SysRoleServiceI;

@ParentPackage(value="basePackage")
@Namespace("/")
@Action(value="roleAction")
@Results(value = {
@Result(name ="addpage", location = "/sys/roleAdd.ftl"),
@Result(name ="openRoleaddPage", location = "/sys/roleAdd.ftl"),
@Result(name ="updatepage", location = "/sys/roleUpdate.ftl"),
@Result(name ="list", location = "/sys/roleList.ftl"),
@Result(name ="roleMenuList", location = "/sys/roleMenuList.ftl"),
@Result(name ="roleAddMenuPage", location = "/sys/roleAddMenuPage.ftl"),
})
public class SysRoleAction {
	
	private SysRoleServiceI sysRoleService;
	
	private SysMenuServiceI sysMenuService;
	
	private SysRole role = new SysRole();
	private String id="";
	private List<SysRole> list = new ArrayList<SysRole>();
	private List<SysMenu> menulist = new ArrayList<SysMenu>();
	private List<String> menuids;
	
	public String openRoleupdatePage()
	{
		menulist = sysRoleService.getMenuList(id);
		return "openRoleaddPage";
	}
	
	public String openRoleaddPage()
	{
		menulist = sysRoleService.getMenuList(id);
		return "openRoleaddPage";
	}
	
	public String addpage()
	{
		return "addpage";
	}
	
	public String updatepage(){
		
		//role.setRoleid(12);
		role = sysRoleService.getEntityByid(id);
		menulist = sysMenuService.getMenuRoleListbyroleid(id);
		
		return "updatepage";
	}
	
	public String updateUser()
	{
		sysRoleService.updateEntity(role);
		
		list = sysRoleService.getList(role);
		
		return list();
	}
	
	public String addRole(){
		
		sysRoleService.addEntity(role);
		
		return list();
	}
	
	public String delete()
	{
		sysRoleService.delEntity(id);
		return list();
	}
	
	public String list(){
		
		//list = sysRoleService.getList(role);
		list = sysRoleService.getRoleMenuList(null);
		return "list";
	}
	
	/*public String roleMenuList(){
		
		list = sysRoleService.getRoleMenuList(null);
		
		return "list";
	}*/
	
	public String roleMenuList(){
		
		list = sysRoleService.getRoleMenuList(id);
		if(list!=null&&list.size()==1){
			role=list.get(0);
		}
		
		return "roleMenuList";
	}
	
	public String roleAddMenuPage()
	{
		role = sysRoleService.getEntityByid(id);
		menulist = sysRoleService.getMenuList(id);
		
		return "roleAddMenuPage";
	}
	
	
	public String roleAddmenu()
	{
		role.setRoledesc("");
		
		if(role.getRoleid()==0){
			sysRoleService.addEntity(role);	
			role = sysRoleService.getEntityByname(role.getRolename());
		}
		id=role.getRoleid()+"";
		sysRoleService.addRoleMenu(role.getRoleid()+"",menuids);
		
		return null;
	}

	public String roleupdatemenu(){
		
		String rolename = role.getRolename();
		role = sysRoleService.getEntityByid(role.getRoleid()+"");
		if(rolename!=null&&!rolename.equals("")&&!role.getRolename().equals(rolename)){
			sysRoleService.updateEntity(role);
		}
		id=role.getRoleid()+"";
		
		//先全部删除掉,然后再重新添加一次.
		sysRoleService.deletRoleMenu(role.getRoleid()+"");
		
		sysRoleService.addRoleMenu(role.getRoleid()+"",menuids);
		
		return null;
	}
	
	
	
	public String deleteRolemenu(){
		sysRoleService.deleteRoleMenu(id,menuids);
		return roleMenuList();
	}
	
	
	@Autowired
	public void setSysRoleService(SysRoleServiceI sysRoleService) {
		this.sysRoleService = sysRoleService;
	}

	public SysRoleServiceI getSysRoleService() {
		return sysRoleService;
	}

	public SysRole getRole() {
		return role;
	}

	public void setRole(SysRole role) {
		this.role = role;
	}

	public List<SysRole> getList() {
		return list;
	}

	public void setList(List<SysRole> list) {
		this.list = list;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<SysMenu> getMenulist() {
		return menulist;
	}

	public void setMenulist(List<SysMenu> menulist) {
		this.menulist = menulist;
	}

	public List<String> getMenuids() {
		return menuids;
	}

	public void setMenuids(List<String> menuids) {
		this.menuids = menuids;
	}

	/**
	 * @return the sysMenuService
	 */
	public SysMenuServiceI getSysMenuService() {
		return sysMenuService;
	}

	/**
	 * @param sysMenuService the sysMenuService to set
	 */
	public void setSysMenuService(SysMenuServiceI sysMenuService) {
		this.sysMenuService = sysMenuService;
	}
	
}
