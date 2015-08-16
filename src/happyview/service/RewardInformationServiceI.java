package happyview.service;

import java.util.List;

import happyview.entity.RewardInformation;

public interface RewardInformationServiceI {
	

	public List<RewardInformation> getList(RewardInformation rf);
	public void addEntity(RewardInformation rf);
	public void updateEntity(RewardInformation rf);
	public RewardInformation getEntityById(int rewardId);
	public void deleteEntity(RewardInformation rf);
	

}
