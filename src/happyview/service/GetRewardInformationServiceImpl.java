package happyview.service;

import happyview.entity.GetRewardInformation;
import happyview.mapper.GetRewardInformationMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value="getrewardInformationService")
public class GetRewardInformationServiceImpl implements GetRewardInformationServiceI {

	private GetRewardInformationMapper GetRewardInformationMapper;
	
	@Autowired
	public void setRewardMapper(GetRewardInformationMapper GetRewardInformationMapper) {
		this.GetRewardInformationMapper = GetRewardInformationMapper;
	}
	
	
	public GetRewardInformationMapper getCotentyingkuiMapper() {
		return GetRewardInformationMapper;
	}


	@Override
	public List<GetRewardInformation> getList(GetRewardInformation grf) {
		return GetRewardInformationMapper.getList(grf);
	}


	@Override
	public void addEntity(GetRewardInformation grf) {
		GetRewardInformationMapper.addEntity(grf);
		
	}
	
	@Override
	public void updateEntity(GetRewardInformation grf) {
		GetRewardInformationMapper.updateEntity(grf);
		
	}


	@Override
	public GetRewardInformation getEntityById(int getrewardId) {
		// TODO Auto-generated method stub
		return GetRewardInformationMapper.getEntityById(getrewardId);
	}


	@Override
	public void deleteEntity(GetRewardInformation grf) {
		// TODO Auto-generated method stub
		GetRewardInformationMapper.deleteEntity(grf);
	}


}
