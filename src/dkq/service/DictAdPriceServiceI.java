package dkq.service;

import java.util.List;

import dkq.entity.DictAdPrice;;

public interface DictAdPriceServiceI {
	
	public void addEntity(DictAdPrice dictPrice);

	public List<DictAdPrice> getList(DictAdPrice dictPrice);

	public DictAdPrice getEntityByid(int userId);

	public void updateEntity(DictAdPrice dictPrice);

	public void delEntity(String id);

}
