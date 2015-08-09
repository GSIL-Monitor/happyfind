package dkq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dkq.entity.DmChannel;
import dkq.entity.SysMenu;
import dkq.entity.SysRole;

public interface SysRoleMapper {
	/**
	 * 
	 * @param userId
	 */
	public SysRole getEntityByid(String userId);
	
	/**
	 * 
	 * @param user
	 */
	public void addEntity(SysRole role);
	
	/**
	 * 
	 * @return
	 */
	public List<SysRole> getList();
	/**
	 * 
	 * @param id
	 */
	public void delEntity(String id);
	/**
	 * update 
	 * @param SysRole
	 */
	public void updateEntity(SysRole role);

	public List<SysRole> getRoleMenuList(String id);

	public List<SysMenu> getMenuList(String id);

	public void addRoleMenu(@Param("roleid")String roleid, @Param("menuid")String menuid);

	public void deleteRoleMenu(@Param("roleid")String roleid, @Param("menuids")String menuids);

	public List<DmChannel> getChannelList();

	public SysRole getEntityByname(@Param("rolename")String rolename);

	public void deletRoleMenu(String roleid); 

}
