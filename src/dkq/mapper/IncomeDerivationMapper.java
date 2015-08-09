package dkq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dkq.entity.IncomeDerivation;

public interface IncomeDerivationMapper {
	/**
	 * 
	 */
	public IncomeDerivation getEntityByid(int id);
	
	/**
	 * 
	 * @param user
	 */
	public void addEntity(IncomeDerivation income);
	
	/**
	 * 
	 * @return
	 */
	public List<IncomeDerivation> getList(IncomeDerivation income);
	
	/**
	 * 
	 * @param id
	 */
	public void delEntity(String id);

	/**
	 * update 
	 * @param SysMenu
	 */
	public void updateEntity(IncomeDerivation dictPrice);


	public List<IncomeDerivation> getIncome(String id);
	
}
