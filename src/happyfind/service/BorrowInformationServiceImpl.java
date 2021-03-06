package happyfind.service;

import happyfind.entity.BorrowInformation;
import happyfind.mapper.BorrowInformationMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value="borrowInformationService")
public class BorrowInformationServiceImpl implements BorrowInformationServiceI {

	private BorrowInformationMapper borrowInformationMapper;
	
	@Autowired
	public void setUserInteractMapper(BorrowInformationMapper borrowInformationMapper) {
		this.borrowInformationMapper = borrowInformationMapper;
	}
	
	
	public BorrowInformationMapper getCotentyingkuiMapper() {
		return borrowInformationMapper;
	}


	@Override
	public List<BorrowInformation> getList(BorrowInformation bf) {
		return borrowInformationMapper.getList(bf);
	}


	@Override
	public void addEntity(BorrowInformation bf) {
		borrowInformationMapper.addEntity(bf);
		
	}
	
	@Override
	public void updateEntity(BorrowInformation bf) {
		borrowInformationMapper.updateEntity(bf);
		
	}


	@Override
	public BorrowInformation getEntityById(int borrowId) {
		// TODO Auto-generated method stub
		return borrowInformationMapper.getEntityById(borrowId);
	}


	@Override
	public void deleteEntity(BorrowInformation bf) {
		// TODO Auto-generated method stub
		borrowInformationMapper.deleteEntity(bf);
	}


}
