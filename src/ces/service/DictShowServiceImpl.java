package ces.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ces.entity.DictShow;
import ces.mapper.DictShowMapper;

@Service(value="dictShowService")
public class DictShowServiceImpl implements DictShowServiceI {

	private DictShowMapper dictShowMapper;
	
	@Autowired
	public void setDictShowMapper(DictShowMapper dictShowMapper) {
		this.dictShowMapper = dictShowMapper;
	}
	
	@Override
	public void addEntity(DictShow entity) {
		dictShowMapper.addEntity(entity);
	}

	public DictShowMapper getDictShowMapper() {
		return dictShowMapper;
	}

	@Override
	public List<DictShow> getList(DictShow entity) {
		
		List<DictShow> list = dictShowMapper.getList(entity);
		
		return list;
	}

	@Override
	public DictShow getEntityByid(String id) {
		
		DictShow user =  dictShowMapper.getEntityByid(id);
		
		return user;
	}

	public void updateEntity(DictShow entity) {
		
		dictShowMapper.updateEntity(entity);
	}

	@Override
	public void delEntity(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uploadfileAdd(ArrayList<ArrayList<String>> list,String channel) {
		
		DictShow dictShow;		
		List<DictShow> listobj=new ArrayList<DictShow>();
		//tv表格样式
		if(channel.equals("tv")){
        for(int i=1; i < list.size(); ++i){
        	dictShow = new DictShow();
        	list.get(i).get(0);
        	
        	dictShow.setSite_id("0");
        	dictShow.setShowid(list.get(i).get(2));
        	dictShow.setShow_name(list.get(i).get(1));
        	dictShow.setAnalyst_type("");
        	dictShow.setUrl("");
        	dictShow.setStat("1");
        	dictShow.setUp_date("0");
        	dictShow.setDown_date("0");
        	dictShow.setAnalyst_owner(list.get(i).get(0));
        	dictShow.setChannel_id("");
        	dictShow.setEpisode("0");
        	dictShow.setEstimate_vv("0");
        	dictShow.setCr_cost("0");
        	dictShow.setPay_flag("");
        	dictShow.setPay_period("");
        	dictShow.setDivide_flag("");
        	listobj.add(dictShow);
        }
        }
		//movie表格样式
		
		for(DictShow entity:listobj){
			dictShowMapper.addEntity(entity);
		}
	}

}
