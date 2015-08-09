package dkq.service;

import java.util.List;

import dkq.entity.SysMenu;
import dkq.entity.SysRole;

public interface SysMenuServiceI {
	
	public void addEntity(SysMenu SysMenu);

	public List<SysMenu> getList(SysMenu SysMenu);

	public SysMenu getEntityByid(int userId);

	public void updateEntity(SysMenu SysMenu);

	public List<SysMenu> getParentList(int i);

	public void delEntity(String id);

	public List<SysMenu> getMenuRole(String id);

	public List<SysMenu> getMenuRoleListbyroleid(String id);

}
