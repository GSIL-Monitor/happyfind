package happyview.service;

import java.util.List;

import happyview.entity.RewardInformation;

public interface RewardInformationServiceI {
	

	public List<RewardInformation> getList(RewardInformation bf);
	public void addEntity(RewardInformation bf);
	public void updateEntity(RewardInformation bf);
	public RewardInformation getEntityById(int rewardId);
	public void deleteEntity(RewardInformation bf);
	

}
