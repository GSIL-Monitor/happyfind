package happyview.service;

import happyview.entity.RightDebtInformation;
import happyview.mapper.RightDebtInformationMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value="RightDebtInformationService")
public class RightDebtInformationServiceImpl implements RightDebtInformationServiceI {

	private RightDebtInformationMapper RightDebtInformationMapper;
	
	@Autowired
	public void setRightDebtMapper(RightDebtInformationMapper RightDebtInformationMapper) {
		this.RightDebtInformationMapper = RightDebtInformationMapper;
	}
	
	
	public RightDebtInformationMapper getCotentyingkuiMapper() {
		return RightDebtInformationMapper;
	}


	@Override
	public List<RightDebtInformation> getList(RightDebtInformation rd) {
		return RightDebtInformationMapper.getList(rd);
	}


	@Override
	public void addEntity(RightDebtInformation rd) {
		RightDebtInformationMapper.addEntity(rd);
		
	}
	
	@Override
	public void updateEntity(RightDebtInformation rd) {
		RightDebtInformationMapper.updateEntity(rd);
		
	}


	@Override
	public RightDebtInformation getEntityById(int id) {
		// TODO Auto-generated method stub
		return RightDebtInformationMapper.getEntityById(id);
	}


	@Override
	public void deleteEntity(RightDebtInformation rd) {
		// TODO Auto-generated method stub
		RightDebtInformationMapper.deleteEntity(rd);
	}


}
