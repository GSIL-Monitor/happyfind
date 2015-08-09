package dkq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dkq.entity.SysMenu;

public interface SysMenuMapper {
	/**
	 * 
	 */
	public SysMenu getEntityByid(int id);
	
	/**
	 * 
	 * @param user
	 */
	public void addEntity(SysMenu sysMenu);
	
	/**
	 * 
	 * @return
	 */
	public List<SysMenu> getList();
	
	/**
	 * 
	 * @param id
	 */
	public void delEntity(String id);

	/**
	 * update 
	 * @param SysMenu
	 */
	public void updateEntity(SysMenu sysMenu);

	public List<SysMenu> getParentList(@Param("lever")int lever);

	public List<SysMenu> getMenuRole(String id);

	public List<SysMenu> getMenuRoleListbyroleid(String id);
	
}
