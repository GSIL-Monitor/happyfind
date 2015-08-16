package happyview.mapper;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import happyview.entity.GetRewardInformation;

public interface GetRewardInformationMapper {
	
	/**
	 * 
	 * @return
	 */
	public List<GetRewardInformation> getList(GetRewardInformation rf);
	
	public void addEntity(GetRewardInformation rf);
	public void updateEntity(GetRewardInformation rf);
	public GetRewardInformation getEntityById(@Param("getrewardId")int getrewardId);
	public void deleteEntity(GetRewardInformation rf);
	
	
}
