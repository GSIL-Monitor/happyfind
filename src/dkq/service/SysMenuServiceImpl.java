package dkq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dkq.entity.SysMenu;
import dkq.mapper.SysMenuMapper;

@Service(value="sysMenuService")
public class SysMenuServiceImpl implements SysMenuServiceI {

	private SysMenuMapper sysMenuMapper;
	
	@Autowired
	public void setSysMenuMapper(SysMenuMapper sysMenuMapper) {
		this.sysMenuMapper = sysMenuMapper;
	}
	
	
	public SysMenuMapper getSysMenuMapper() {
		return sysMenuMapper;
	}


	@Override
	public void addEntity(SysMenu Menu) {
		
		sysMenuMapper.addEntity(Menu);
	
	}

	@Override
	public List<SysMenu> getList(SysMenu SysMenu) {
		
		List<SysMenu> list = sysMenuMapper.getList();
		
		return list;
	}

	@Override
	public SysMenu getEntityByid(int userId) {
		
		SysMenu user =  sysMenuMapper.getEntityByid(userId);
		
		return user;
	}

	@Override
	public void updateEntity(SysMenu sysMenu) {
		
		sysMenuMapper.updateEntity(sysMenu);
	}


	@Override
	public List<SysMenu> getParentList(int lever) {
		
		List<SysMenu> list = sysMenuMapper.getParentList(lever);
		
		return list;
	}


	@Override
	public void delEntity(String id) {
		// TODO Auto-generated method stub
		sysMenuMapper.delEntity(id);
	}


	@Override
	public List<SysMenu> getMenuRole(String id) {
		// TODO Auto-generated method stub
		return sysMenuMapper.getMenuRole(id);
	}


	@Override
	public List<SysMenu> getMenuRoleListbyroleid(String id) {
		// TODO Auto-generated method stub
		return sysMenuMapper.getMenuRoleListbyroleid(id);
	}

}
