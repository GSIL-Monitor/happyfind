package dkq.service;

import java.util.List;

import dkq.entity.IncomeDerivation;

public interface IncomeDerivationServiceI {
	
	public void addEntity(IncomeDerivation income);

	public List<IncomeDerivation> getList(IncomeDerivation income);

	public IncomeDerivation getEntityByid(int Id);

	public void updateEntity(IncomeDerivation income);

	public void delEntity(String id);

}
