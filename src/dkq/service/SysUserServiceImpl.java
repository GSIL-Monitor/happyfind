package dkq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dkq.entity.SysDept;
import dkq.entity.SysDeptUser;
import dkq.entity.SysUser;
import dkq.mapper.SysUserMapper;

@Service(value="sysUserService")
public class SysUserServiceImpl implements SysUserServiceI {

	private SysUserMapper sysUserMapper;
	
	@Autowired
	public void setSysUserMapper(SysUserMapper sysUserMapper) {
		this.sysUserMapper = sysUserMapper;
	}
	
	public SysUserMapper getSysUserMapper() {
		return sysUserMapper;
	}

	@Override
	public void addEntity(SysUser user) {
		sysUserMapper.addEntity(user);
	}

	@Override
	public List<SysUser> getList(SysUser user) {
		
		List<SysUser> list = sysUserMapper.getList(user);
		
		return list;
	}

	@Override
	public SysUser getEntityByid(int userId) {
		
		SysUser user =  sysUserMapper.getEntityByid(userId);
		
		return user;
	}

	@Override
	public void updateEntity(SysUser sysuser) {
		
		 sysUserMapper.updateEntity(sysuser);
	}

	@Override
	public SysUser getLogonInfo(String username, String password) {
		
		List<SysUser> user =  sysUserMapper.getLogonUser(username,password);
		
		return user.get(0);
	}

	@Override
	public List<SysDept> getDeptList() {
		
		List<SysDept> list = sysUserMapper.getDeptList();
		
		return list;
	}

	@Override
	public List<SysDeptUser> getDeptUserList() {
		// TODO Auto-generated method stub
		List<SysDeptUser> list = sysUserMapper.getDeptUserList();
		return list;
	}

	@Override
	public void delEntity(String userid) {
		// TODO Auto-generated method stub
		sysUserMapper.delEntity(userid);
		
	}

	@Override
	public void chgstatu(String id, String status) {
		// TODO Auto-generated method stub
		sysUserMapper.chgstatu(id,status);
		
	}
}
