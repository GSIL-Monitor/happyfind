package happyview.service;

import happyview.entity.RewardInformation;
import happyview.mapper.RewardInformationMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value="rewardInformationService")
public class RewardInformationServiceImpl implements RewardInformationServiceI {

	private RewardInformationMapper RewardInformationMapper;
	
	@Autowired
	public void setRewardMapper(RewardInformationMapper RewardInformationMapper) {
		this.RewardInformationMapper = RewardInformationMapper;
	}
	
	
	public RewardInformationMapper getCotentyingkuiMapper() {
		return RewardInformationMapper;
	}


	@Override
	public List<RewardInformation> getList(RewardInformation rf) {
		return RewardInformationMapper.getList(rf);
	}


	@Override
	public void addEntity(RewardInformation rf) {
		RewardInformationMapper.addEntity(rf);
		
	}
	
	@Override
	public void updateEntity(RewardInformation rf) {
		RewardInformationMapper.updateEntity(rf);
		
	}


	@Override
	public RewardInformation getEntityById(int getrewardId) {
		// TODO Auto-generated method stub
		return RewardInformationMapper.getEntityById(getrewardId);
	}


	@Override
	public void deleteEntity(RewardInformation rf) {
		// TODO Auto-generated method stub
		RewardInformationMapper.deleteEntity(rf);
	}


}
