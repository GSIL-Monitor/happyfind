package happyview.mapper;

import java.util.List;



import org.apache.ibatis.annotations.Param;

import happyview.entity.RightDebtInformation;

public interface RightDebtInformationMapper {
	
	/**
	 * 
	 * @return
	 */
	public List<RightDebtInformation> getList(RightDebtInformation rd);
	
	public void addEntity(RightDebtInformation rd);
	public void updateEntity(RightDebtInformation rd);
	public RightDebtInformation getEntityById(@Param("id")int id);
	public void deleteEntity(RightDebtInformation rd);
	
	
}
