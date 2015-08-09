package dkq.entity;

public class DictAdPrice {

	int id;
	int siteId;
	String siteName;
	int channelId;
	String channelName;
	int systypeId;
	String systypeName;
	String startTime;
	String endTime;
	Double price;
	String subUser ;
	String createTime;
	String updateTime;
	
	
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getSubUser() {
		return subUser;
	}
	public void setSubUser(String subUser) {
		this.subUser = subUser;
	}
	public int getSystypeId() {
		return systypeId;
	}
	public void setSystypeId(int systypeId) {
		this.systypeId = systypeId;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getSystypeName() {
		return systypeName;
	}
	public void setSystypeName(String systypeName) {
		this.systypeName = systypeName;
	}
	
	
	
}
