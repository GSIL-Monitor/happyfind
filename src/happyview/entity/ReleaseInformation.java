package happyview.entity;

public class ReleaseInformation {

	private int id; 
	private String name; //姓名
	private String idCard; //身份证
	private int releaseType; //举报类型
	private double loanAmount; //贷款金额
	private double debtAmount; //欠款金额
	private String loanInstitutions; //贷款机构
	
	private String releaseTime;//举报时间
	private String loanTime;//贷款时间
	private String loanTimelimit;//贷款期限
	private String overdueTime;//逾期日期
	private int type;//个人举报和机构举报
	private double selectAmount;//查询价格
	private int isAnonymity;//是否匿名
	
	private String contactnumber1;
	private String contactnumber2;
	private String contactnumber3;
	
	private String moduser;  //
	private String modtime; //
	private String updateTime;  //
	private int deleteFlag;   //1是已删除
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
	public int getReleaseType() {
		return releaseType;
	}
	public void setReleaseType(int releaseType) {
		this.releaseType = releaseType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getDebtAmount() {
		return debtAmount;
	}
	public void setDebtAmount(double debtAmount) {
		this.debtAmount = debtAmount;
	}
	public String getLoanInstitutions() {
		return loanInstitutions;
	}
	public void setLoanInstitutions(String loanInstitutions) {
		this.loanInstitutions = loanInstitutions;
	}
	public String getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}
	public String getLoanTime() {
		return loanTime;
	}
	public void setLoanTime(String loanTime) {
		this.loanTime = loanTime;
	}
	public String getLoanTimelimit() {
		return loanTimelimit;
	}
	public void setLoanTimelimit(String loanTimelimit) {
		this.loanTimelimit = loanTimelimit;
	}
	public String getOverdueTime() {
		return overdueTime;
	}
	public void setOverdueTime(String overdueTime) {
		this.overdueTime = overdueTime;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getSelectAmount() {
		return selectAmount;
	}
	public void setSelectAmount(double selectAmount) {
		this.selectAmount = selectAmount;
	}
	public int getIsAnonymity() {
		return isAnonymity;
	}
	public void setIsAnonymity(int isAnonymity) {
		this.isAnonymity = isAnonymity;
	}
	public String getModuser() {
		return moduser;
	}
	public void setModuser(String moduser) {
		this.moduser = moduser;
	}
	public String getModtime() {
		return modtime;
	}
	public void setModtime(String modtime) {
		this.modtime = modtime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
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
	public int getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
	
	
	
	
}
