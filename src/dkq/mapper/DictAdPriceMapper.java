package dkq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dkq.entity.DictAdPrice;;

public interface DictAdPriceMapper {
	/**
	 * 
	 */
	public DictAdPrice getEntityByid(int id);
	
	/**
	 * 
	 * @param user
	 */
	public void addEntity(DictAdPrice dictPrice);
	
	/**
	 * 
	 * @return
	 */
	public List<DictAdPrice> getList(DictAdPrice dictPrice);
	
	/**
	 * 
	 * @param id
	 */
	public void delEntity(String id);

	/**
	 * update 
	 * @param SysMenu
	 */
	public void updateEntity(DictAdPrice dictPrice);

	public List<DictAdPrice> getParentList(@Param("lever")int lever);

	public List<DictAdPrice> getMenuRole(String id);
	
}
