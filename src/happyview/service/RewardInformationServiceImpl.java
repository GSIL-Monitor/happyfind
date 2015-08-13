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
	public void setUserInteractMapper(RewardInformationMapper RewardInformationMapper) {
		this.RewardInformationMapper = RewardInformationMapper;
	}
	
	
	public RewardInformationMapper getCotentyingkuiMapper() {
		return RewardInformationMapper;
	}


	@Override
	public List<RewardInformation> getList(RewardInformation bf) {
		return RewardInformationMapper.getList(bf);
	}


	@Override
	public void addEntity(RewardInformation bf) {
		RewardInformationMapper.addEntity(bf);
		
	}
	
	@Override
	public void updateEntity(RewardInformation bf) {
		RewardInformationMapper.updateEntity(bf);
		
	}


	@Override
	public RewardInformation getEntityById(int rewardId) {
		// TODO Auto-generated method stub
		return RewardInformationMapper.getEntityById(rewardId);
	}


	@Override
	public void deleteEntity(RewardInformation bf) {
		// TODO Auto-generated method stub
		RewardInformationMapper.deleteEntity(bf);
	}


}
