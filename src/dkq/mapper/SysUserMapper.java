package dkq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dkq.entity.SysDept;
import dkq.entity.SysDeptUser;
import dkq.entity.SysUser;

public interface SysUserMapper {
	/**
	 * 
	 * @param userId
	 */
	public SysUser getEntityByid(int userId);
	
	/**
	 * 
	 * @param user
	 */
	public void addEntity(SysUser user);
	
	/**
	 * 
	 * @return
	 */
	public List<SysUser> getList(SysUser user);
	
	/**
	 * 
	 * @param id
	 */
	public void delEntity(String id);

	/**
	 * update 
	 * @param sysuser
	 */
	public void updateEntity(SysUser sysuser);

	/**
	 * 取得登录用户数
	 * @param username
	 * @param password
	 * @return
	 */
	public List<SysUser> getLogonUser(@Param("username")String username, @Param("password")String password);

	public List<SysDept> getDeptList();

	public List<SysDeptUser> getDeptUserList();

	public void delEntity(int userid);

	public void chgstatu(@Param("userid")String id, @Param("status")String status);
	
}
