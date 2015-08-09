package dkq.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import dkq.entity.DmChannel;
import dkq.entity.SysDept;
import dkq.entity.SysDeptUser;
import dkq.entity.SysRole;
import dkq.entity.SysUser;
import dkq.service.SysRoleServiceI;
import dkq.service.SysUserServiceI;

@ParentPackage(value="basePackage")
@Namespace("/")
@Action(value="userAction")
@Results(value = {
@Result(name ="loginpage", location = "/login.ftl"),
@Result(name ="success", location = "/login/logon.ftl"),
@Result(name ="add", location = "/index.jsp"),
@Result(name ="addpage", location = "/sys/userAdd.ftl"),
@Result(name ="applypage", location = "/sys/applypage.ftl"),
@Result(name ="openRghpage", location = "/sys/openrghpage.ftl"),
@Result(name ="updatepage", location = "/sys/userUpdate.ftl"),
@Result(name ="list", type="freemarker", location = "/sys/userList.ftl"),
})
public class SysUserAction {
	
	private SysUserServiceI sysUserService;
	private SysRoleServiceI sysRoleService;
	
	private SysUser user = new SysUser();
	private String id = "";
	private List<SysUser> list = new ArrayList<SysUser>();
	
	private List<SysDept> deptList = new ArrayList<SysDept>();
	private List<SysRole> roleList = new ArrayList<SysRole>();
	private List<String> channelStrList = new ArrayList<String>();
	
	private List<SysDeptUser> deptUserList = new ArrayList<SysDeptUser>();
	
	
	public String addpage()
	{
		deptList = sysUserService.getDeptList();
		roleList = sysRoleService.getList(null);
		
		return "addpage";
	}
	
	public String apply()
	{
		user.setPassword("passwrd");
		user.setUsername(user.getEmail().substring(0, user.getEmail().indexOf("@")));
		//user.setApplychannel(channelStrList.toString());
		user.setPassword("");
		user.setChennelid("");
		user.setStatus(0);
		sysUserService.addEntity(user);
		
		return null;
	}
	
	public String applypage()
	{
		channelStrList.add("电视");
		channelStrList.add("电影");
		channelStrList.add("动漫");
		channelStrList.add("综艺");
		
		return "applypage";
	}
	
	public String openRghpage()
	{
		roleList = sysRoleService.getList(null);
		
		return "openRghpage";
	}
	
	public String closeRgh()
	{
		user.setUserid(Integer.parseInt(id));
		user.setRoleid(0);
		user.setStatus(0);
		sysUserService.updateEntity(user);
		
		return list();
	}
	
	//开通权限
	public String openrgh()
	{
		//sysUserService.chgstatu(id,"1");
		sysUserService.updateEntity(user);
		//sysUserService.rightChange(user);
		return null;
	}
	
	public String updatepage(){
		
		user.setUserid(12);
		user = sysUserService.getEntityByid(user.getUserid());
		
		return "updatepage";
	}
	
	public String updateUser()
	{
		sysUserService.updateEntity(user);
		
		list = sysUserService.getList(user);
		
		return list();
	}
	
	public String delete()
	{
		
		sysUserService.delEntity(id);
		return list();
	}
	
	public String addUser(){
		
		/*		
		user=new SysUser();
		user.setUserid(1222);
		user.setChennelid("1");
		user.setDeptid(1);
		user.setRoleid(1);
		user.setStatus(1);
		user.setUsername("zhongzhiqun");
		user.setEmail("zhonzhiqun@youku.com");
		 */
		
		user.setPassword("passwrd");
		sysUserService.addEntity(user);
		
		return list();
	}
	
	public String chgstatuon(){
		
		sysUserService.chgstatu(id,"1");
		
		return list();
	}
	
	public String chgstatuoff(){
		
		sysUserService.chgstatu(id,"0");
		
		return list();
	}
	
	public String list(){
		if(user.getUsername()!=null&&user.getUsername().equals("输入用户姓名或邮箱")){
			user.setUsername("");
		}
		list = sysUserService.getList(user);
		deptList = sysUserService.getDeptList();
		roleList = sysRoleService.getList(null);
		
		return "list";
	}
	
	@Autowired
	public void setSysUserService(SysUserServiceI sysUserService) {
		this.sysUserService = sysUserService;
	}

	public SysRoleServiceI getSysRoleService() {
		return sysRoleService;
	}

	@Autowired
	public void setSysRoleService(SysRoleServiceI sysRoleService) {
		this.sysRoleService = sysRoleService;
	}

	public SysUserServiceI getSysUserService() {
		return sysUserService;
	}

	public SysUser getUser() {
		return user;
	}

	public void setUser(SysUser user) {
		this.user = user;
	}

	public List<SysUser> getList() {
		return list;
	}

	public void setList(List<SysUser> list) {
		this.list = list;
	}

	public List<SysDept> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<SysDept> deptList) {
		this.deptList = deptList;
	}

	public List<SysDeptUser> getDeptUserList() {
		return deptUserList;
	}

	public void setDeptUserList(List<SysDeptUser> deptUserList) {
		this.deptUserList = deptUserList;
	}

	public List<SysRole> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<SysRole> roleList) {
		this.roleList = roleList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getChannelStrList() {
		return channelStrList;
	}

	public void setChannelStrList(List<String> channelStrList) {
		this.channelStrList = channelStrList;
	}

}
