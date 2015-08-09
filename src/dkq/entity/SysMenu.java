package dkq.entity;

import java.util.List;

public class SysMenu {

	int menuid;
	String menuname;
	String menudesc;
	int parentid;
	int lever;
	List<SysRole> roles;
	
	public void printSysMenu() {
		System.out.println(this.menuid + "\t" + this.menuname + "\t" + this.menudesc + "\t" + this.parentid + "\t" + this.lever);
	}
	
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}

	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenudesc() {
		return menudesc;
	}
	public void setMenudesc(String menudesc) {
		this.menudesc = menudesc;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public int getLever() {
		return lever;
	}
	public void setLever(int lever) {
		this.lever = lever;
	}
	public List<SysRole> getRoles() {
		return roles;
	}
	public void setRoles(List<SysRole> roles) {
		this.roles = roles;
	}

	
	
}
