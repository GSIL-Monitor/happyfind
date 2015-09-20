package happyview.service;

import happyview.entity.FindPeopleInformation;
import happyview.mapper.FindPeopleInformationMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value="FindPeopleInformationService")
public class FindPeopleInformationServiceImpl implements FindPeopleInformationServiceI {

	private FindPeopleInformationMapper FindPeopleInformationMapper;
	
	@Autowired
	public void setFindPeopleMapper(FindPeopleInformationMapper FindPeopleInformationMapper) {
		this.FindPeopleInformationMapper = FindPeopleInformationMapper;
	}
	
	
	public FindPeopleInformationMapper getCotentyingkuiMapper() {
		return FindPeopleInformationMapper;
	}


	@Override
	public List<FindPeopleInformation> getList(FindPeopleInformation fp) {
		return FindPeopleInformationMapper.getList(fp);
	}


	@Override
	public void addEntity(FindPeopleInformation fp) {
		FindPeopleInformationMapper.addEntity(fp);
		
	}
	
	@Override
	public void updateEntity(FindPeopleInformation fp) {
		FindPeopleInformationMapper.updateEntity(fp);
		
	}


	@Override
	public FindPeopleInformation getEntityById(int id) {
		// TODO Auto-generated method stub
		return FindPeopleInformationMapper.getEntityById(id);
	}


	@Override
	public void deleteEntity(FindPeopleInformation fp) {
		// TODO Auto-generated method stub
		FindPeopleInformationMapper.deleteEntity(fp);
	}


}
