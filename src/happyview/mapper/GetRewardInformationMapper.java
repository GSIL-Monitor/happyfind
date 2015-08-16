package happyview.mapper;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import happyview.entity.GetRewardInformation;

public interface GetRewardInformationMapper {
	
	/**
	 * 
	 * @return
	 */
	public List<GetRewardInformation> getList(GetRewardInformation grf);
	
	public void addEntity(GetRewardInformation grf);
	public void updateEntity(GetRewardInformation grf);
	public GetRewardInformation getEntityById(@Param("getrewardId")int getrewardId);
	public void deleteEntity(GetRewardInformation grf);
	
	
}
