package dkq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dkq.entity.DictAdPrice;
import dkq.entity.IncomeDerivation;
import dkq.mapper.IncomeDerivationMapper;

@Service(value="incomeDerivationService")
public class IncomeDerivationServiceImpl implements IncomeDerivationServiceI {

	private IncomeDerivationMapper incomeDerivationMapper;
	
	@Autowired
	public void setSysMenuMapper(IncomeDerivationMapper incomeDerivationMapper) {
		this.incomeDerivationMapper = incomeDerivationMapper;
	}
	
	
	public IncomeDerivationMapper getdictincomeMapper() {
		return incomeDerivationMapper;
	}


	@Override
	public void addEntity(IncomeDerivation income) {
		// TODO Auto-generated method stub
		incomeDerivationMapper.addEntity(income);
	}




	@Override
	public List<IncomeDerivation> getList(IncomeDerivation income) {
		// TODO Auto-generated method stub
		List<IncomeDerivation> list=incomeDerivationMapper.getList(income);
		return list;
	}


	@Override
	public void delEntity(String id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public IncomeDerivation getEntityByid(int Id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateEntity(IncomeDerivation income) {
		// TODO Auto-generated method stub
		
	}





}
