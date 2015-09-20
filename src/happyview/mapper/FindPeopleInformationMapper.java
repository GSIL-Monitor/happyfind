package happyview.mapper;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import happyview.entity.FindPeopleInformation;

public interface FindPeopleInformationMapper {
	
	/**
	 * 
	 * @return
	 */
	public List<FindPeopleInformation> getList(FindPeopleInformation fp);
	
	public void addEntity(FindPeopleInformation fp);
	public void updateEntity(FindPeopleInformation fp);
	public FindPeopleInformation getEntityById(@Param("id")int id);
	public void deleteEntity(FindPeopleInformation fp);
	
	
}
