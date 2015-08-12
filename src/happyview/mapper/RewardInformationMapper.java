package happyview.mapper;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import happyview.entity.RewardInformation;

public interface RewardInformationMapper {
	
	/**
	 * 
	 * @return
	 */
	public List<RewardInformation> getList(RewardInformation rf);
	
	public void addEntity(RewardInformation rf);
	public void updateEntity(RewardInformation rf);
	public RewardInformation getEntityById(@Param("rewardId")int rewardId);
	public void deleteEntity(RewardInformation rf);
	
	
}
