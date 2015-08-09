package dkq.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dkq.entity.DmChannel;
import dkq.entity.SysMenu;
import dkq.entity.SysRole;
import dkq.mapper.SysRoleMapper;

@Service(value="sysRoleService")
public class SysRoleServiceImpl implements SysRoleServiceI {

	private SysRoleMapper sysRoleMapper;
	
	public SysRoleMapper getSysRoleMapper() {
		return sysRoleMapper;
	}
	
	@Autowired
	public void setSysRoleMapper(SysRoleMapper sysRoleMapper) {
		this.sysRoleMapper = sysRoleMapper;
	}

	@Override
	public void addEntity(SysRole role) {
		
		sysRoleMapper.addEntity(role);
		
	}
	
	@Override
	public List<SysRole> getList(SysRole role) {
		
		List<SysRole> list = sysRoleMapper.getList();
		
		return list;
	}

	@Override
	public SysRole getEntityByid(String userId) {
		
		SysRole role =  sysRoleMapper.getEntityByid(userId);
		
		return role;
	}

	@Override
	public void updateEntity(SysRole sysRole) {
		
		 sysRoleMapper.updateEntity(sysRole);
	}

	@Override
	public void delEntity(String id) {
		// TODO Auto-generated method stub
		
		sysRoleMapper.delEntity(id);
		
	}

	@Override
	public List<SysRole> getRoleMenuList(String id) {
		
		List<SysRole> list = sysRoleMapper.getRoleMenuList(id);
		
		return list;
	}

	@Override
	public List<SysMenu> getMenuList(String id) {
		// TODO Auto-generated method stub
		return sysRoleMapper.getMenuList(id);
	}

	@Override
	public void addRoleMenu(String id, List<String> menuids) {
		// TODO Auto-generated method stub
		
		for(String menuid:menuids)
		{
			sysRoleMapper.addRoleMenu(id,menuid);
		}
	}

	@Override
	public void deleteRoleMenu(String id, List<String> menuids) {
		// TODO Auto-generated method stub
		String strmenuids="";
		for(String menuid:menuids)
		{
			strmenuids = menuid+",";
		}
		if(!strmenuids.equals(""))
		{
			strmenuids=strmenuids.substring(0,strmenuids.length()-1);
			sysRoleMapper.deleteRoleMenu(id,strmenuids);
		}
	}

	@Override
	public List<DmChannel> getChannelList() {
		// TODO Auto-generated method stub
		return sysRoleMapper.getChannelList();
	}

	@Override
	public SysRole getEntityByname(String rolename) {
		// TODO Auto-generated method stub
		return  sysRoleMapper.getEntityByname(rolename);
	}

	@Override
	public void deletRoleMenu(String roleid) {
		sysRoleMapper.deletRoleMenu(roleid);
		
	}
	
}
