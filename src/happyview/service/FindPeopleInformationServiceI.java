package happyview.service;

import java.util.List;

import happyview.entity.FindPeopleInformation;

public interface FindPeopleInformationServiceI {
	

	public List<FindPeopleInformation> getList(FindPeopleInformation fp);
	public void addEntity(FindPeopleInformation fp);
	public void updateEntity(FindPeopleInformation fp);
	public FindPeopleInformation getEntityById(int id);
	public void deleteEntity(FindPeopleInformation fp);
	

}
