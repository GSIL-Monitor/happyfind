package happyview.mapper;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import happyview.entity.ReleaseInformation;

public interface ReleaseInformationMapper {
	
	/**
	 * 
	 * @return
	 */
	public List<ReleaseInformation> getList(ReleaseInformation release);
	public void addEntity(ReleaseInformation release);
	public void updateEntity(ReleaseInformation release);
	public ReleaseInformation getEntityById(@Param("id")int id);
	public void deleteEntity(ReleaseInformation release);
	
	
}
