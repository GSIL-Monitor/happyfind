package happyview.service;

import java.util.List;

import happyview.entity.ReleaseInformation;

public interface ReleaseInformationServiceI {
	

	public List<ReleaseInformation> getList(ReleaseInformation bf);
	public void addEntity(ReleaseInformation bf);
	public void updateEntity(ReleaseInformation bf);
	public ReleaseInformation getEntityById(int rewardId);
	public void deleteEntity(ReleaseInformation bf);
	

}
