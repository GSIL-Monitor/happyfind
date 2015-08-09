package dkq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dkq.entity.DictAdPrice;
import dkq.mapper.DictAdPriceMapper;

@Service(value="dictAdPriceService")
public class DictAdPriceServiceImpl implements DictAdPriceServiceI {

	private DictAdPriceMapper dictAdPriceMapper;
	
	@Autowired
	public void setSysMenuMapper(DictAdPriceMapper dictAdPriceMapper) {
		this.dictAdPriceMapper = dictAdPriceMapper;
	}
	
	
	public DictAdPriceMapper getdictAdPriceMapper() {
		return dictAdPriceMapper;
	}


	@Override
	public void addEntity(DictAdPrice dictPrice) {
		// TODO Auto-generated method stub
		dictAdPriceMapper.addEntity(dictPrice);
	}




	@Override
	public List<DictAdPrice> getList(DictAdPrice dictPrice) {
		// TODO Auto-generated method stub
		List<DictAdPrice> list=dictAdPriceMapper.getList(dictPrice);
		return list;
	}


	@Override
	public void updateEntity(DictAdPrice dictPrice) {
		// TODO Auto-generated method stub
		dictAdPriceMapper.updateEntity(dictPrice);
	}


	@Override
	public void delEntity(String id) {
		// TODO Auto-generated method stub
		dictAdPriceMapper.delEntity(id);
		
	}



	@Override
	public DictAdPrice getEntityByid(int id) {
		// TODO Auto-generated method stub
		return dictAdPriceMapper.getEntityByid(id);
	}

}
