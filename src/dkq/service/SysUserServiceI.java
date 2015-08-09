package dkq.service;

import java.util.List;

import dkq.entity.SysDept;
import dkq.entity.SysDeptUser;
import dkq.entity.SysRole;
import dkq.entity.SysUser;

public interface SysUserServiceI {

	public void addEntity(SysUser sysuser);

	public List<SysUser> getList(SysUser sysuser);
	
	public SysUser getEntityByid(int userId);

	public void updateEntity(SysUser sysuser);

	public SysUser getLogonInfo(String username, String password);

	public List<SysDept> getDeptList();

	public List<SysDeptUser> getDeptUserList();

	public void delEntity(String id);

	public void chgstatu(String id, String string);
	
}
