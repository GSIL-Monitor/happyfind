package dkq.service;

import java.util.List;

import dkq.entity.DmChannel;
import dkq.entity.SysMenu;
import dkq.entity.SysRole;

public interface SysRoleServiceI {
	public void addEntity(SysRole SysRole);

	public List<SysRole> getList(SysRole SysRole);

	public SysRole getEntityByid(String userId);

	public void updateEntity(SysRole SysRole);

	public void delEntity(String id);

	public List<SysRole> getRoleMenuList(String id);

	public List<SysMenu> getMenuList(String roleid);

	public void addRoleMenu(String id, List<String> menuids);

	public void deleteRoleMenu(String id, List<String> menuids);

	public List<DmChannel> getChannelList();

	public SysRole getEntityByname(String rolename);

	public void deletRoleMenu(String string);

}
