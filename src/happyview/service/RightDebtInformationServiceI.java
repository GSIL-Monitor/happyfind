package happyview.service;

import java.util.List;

import happyview.entity.RightDebtInformation;

public interface RightDebtInformationServiceI {
	

	public List<RightDebtInformation> getList(RightDebtInformation rd);
	public void addEntity(RightDebtInformation rd);
	public void updateEntity(RightDebtInformation rd);
	public RightDebtInformation getEntityById(int id);
	public void deleteEntity(RightDebtInformation rd);
	

}
