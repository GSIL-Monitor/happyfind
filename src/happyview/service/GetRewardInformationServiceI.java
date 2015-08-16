package happyview.service;

import java.util.List;

import happyview.entity.GetRewardInformation;

public interface GetRewardInformationServiceI {
	

	public List<GetRewardInformation> getList(GetRewardInformation grf);
	public void addEntity(GetRewardInformation grf);
	public void updateEntity(GetRewardInformation grf);
	public GetRewardInformation getEntityById(int getrewardId);
	public void deleteEntity(GetRewardInformation grf);
	

}
