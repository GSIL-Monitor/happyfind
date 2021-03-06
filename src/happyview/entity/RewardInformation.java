package happyview.entity;

public class RewardInformation {
	private int id;
	private String name;
	private String idCard;
	private String loantime;//贷款时间
	private String loanmount;//贷款金额
	private String releasetime; //发布日期
	private String rewardamount;  //悬赏金额
	private String arrearsamount; //欠款金额
	private String contactnumber1;  //
	private String contactnumber2;   
	private String contactnumber3;  
	private String type;   //分为个人和机构
	private String moduser;  //
	private String modtime; //
	private String updateTime;  //
	private String deleteFlag;   //1是已删除
	
	public String getModtime() {
		return modtime;
	}
	public void setModtime(String modtime) {
		this.modtime = modtime;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getLoantime() {
		return loantime;
	}
	public void setLoantime(String loantime) {
		this.loantime = loantime;
	}
	public String getLoanmount() {
		return loanmount;
	}
	public void setLoanmount(String loanmount) {
		this.loanmount = loanmount;
	}
	public String getReleasetime() {
		return releasetime;
	}
	public void setReleasetime(String releasetime) {
		this.releasetime = releasetime;
	}
	public String getRewardamount() {
		return rewardamount;
	}
	public void setRewardamount(String rewardamount) {
		this.rewardamount = rewardamount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModuser() {
		return moduser;
	}
	public void setModuser(String moduser) {
		this.moduser = moduser;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public String getContactnumber1() {
		return contactnumber1;
	}
	public void setContactnumber1(String contactnumber1) {
		this.contactnumber1 = contactnumber1;
	}
	public String getContactnumber2() {
		return contactnumber2;
	}
	public void setContactnumber2(String contactnumber2) {
		this.contactnumber2 = contactnumber2;
	}
	public String getContactnumber3() {
		return contactnumber3;
	}
	public void setContactnumber3(String contactnumber3) {
		this.contactnumber3 = contactnumber3;
	}
	public String getArrearsamount() {
		return arrearsamount;
	}
	public void setArrearsamount(String arrearsamount) {
		this.arrearsamount = arrearsamount;
	}
	
	
}
