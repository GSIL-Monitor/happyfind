package dkq.entity;

public class SysUser {

	int userid;
	String username;
	String password;
	String email;
	int deptid;
	int roleid;
	String chennelid;
	int status;
	String userjob;
	String applydesc;
	String applychannel;
	
	SysDept sysDept;
	SysRole sysRole;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getChennelid() {
		return chennelid;
	}
	public void setChennelid(String chennelid) {
		this.chennelid = chennelid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public SysRole getSysRole() {
		return sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public SysDept getSysDept() {
		return sysDept;
	}
	public void setSysDept(SysDept sysDept) {
		this.sysDept = sysDept;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getUserjob() {
		return userjob;
	}
	public void setUserjob(String userjob) {
		this.userjob = userjob;
	}
	public String getApplydesc() {
		return applydesc;
	}
	public void setApplydesc(String applydesc) {
		this.applydesc = applydesc;
	}
	public String getApplychannel() {
		return applychannel;
	}
	public void setApplychannel(String applychannel) {
		this.applychannel = applychannel;
	}

	
}
