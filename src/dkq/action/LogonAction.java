package dkq.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import dkq.entity.SysUser;
import dkq.service.SysUserServiceI;

@ParentPackage(value="basePackage")
@Namespace("/")
@Action(value="logonAction")
@Results(value = {
@Result(name ="success", location = "/main.ftl"),
@Result(name ="error", location = "/error.ftl"),
})
public class LogonAction {
	private SysUserServiceI sysUserService;
	private SysUser user = new SysUser();
	private List<SysUser> list = new ArrayList<SysUser>();
	
	public String logon(){

		user = sysUserService.getLogonInfo(user.getUsername(),user.getPassword());
		
		if(user!=null&&user.getUsername()!=null&&!user.getUsername().equals(""))
		{
			return "success";
		}
		else{
			return "error";
		}
	}
	
	@Autowired
	public void setSysUserService(SysUserServiceI sysUserService) {
		this.sysUserService = sysUserService;
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
	
}
