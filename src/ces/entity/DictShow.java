package ces.entity;

import java.util.Date;

public class DictShow {
	
	int id;       //主键
	String site_id;  //站点ID
	String showid;   //节目IDz
	String show_name;  //节目名称
	String analyst_type; //分析类型: 1. 按剧结束分析;  2. 按自然月分析
	String url;  	//节目地址
	String stat;  	//状态：1. 需要分析； 2. 分析完成  3. 停址分析
	String up_date;    //首期上线日期
	String down_date;  //末期日期
	Date create_time;  //创建时间
	String analyst_owner;  //此条内容上传者
	String channel_id;    //频道内容ID
	String episode;    //总集数,当是按剧结束分析的才填，可以选择性填
	String estimate_vv;    //预估量VV
	String cr_cost;        //版权成本
	String pay_flag;    //是否收费
	String pay_period;   //付费周期
	String divide_flag;  //是否参与分成
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSite_id() {
		return site_id;
	}
	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}
	public String getShowid() {
		return showid;
	}
	public void setShowid(String showid) {
		this.showid = showid;
	}
	public String getShow_name() {
		return show_name;
	}
	public void setShow_name(String show_name) {
		this.show_name = show_name;
	}
	public String getAnalyst_type() {
		return analyst_type;
	}
	public void setAnalyst_type(String analyst_type) {
		this.analyst_type = analyst_type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getUp_date() {
		return up_date;
	}
	public void setUp_date(String up_date) {
		this.up_date = up_date;
	}
	public String getDown_date() {
		return down_date;
	}
	public void setDown_date(String down_date) {
		this.down_date = down_date;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getAnalyst_owner() {
		return analyst_owner;
	}
	public void setAnalyst_owner(String analyst_owner) {
		this.analyst_owner = analyst_owner;
	}
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	public String getEpisode() {
		return episode;
	}
	public void setEpisode(String episode) {
		this.episode = episode;
	}
	public String getEstimate_vv() {
		return estimate_vv;
	}
	public void setEstimate_vv(String estimate_vv) {
		this.estimate_vv = estimate_vv;
	}
	public String getCr_cost() {
		return cr_cost;
	}
	public void setCr_cost(String cr_cost) {
		this.cr_cost = cr_cost;
	}
	public String getPay_flag() {
		return pay_flag;
	}
	public void setPay_flag(String pay_flag) {
		this.pay_flag = pay_flag;
	}
	public String getPay_period() {
		return pay_period;
	}
	public void setPay_period(String pay_period) {
		this.pay_period = pay_period;
	}
	public String getDivide_flag() {
		return divide_flag;
	}
	public void setDivide_flag(String divide_flag) {
		this.divide_flag = divide_flag;
	}
	
	
	
}
