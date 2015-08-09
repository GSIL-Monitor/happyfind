package ces.mapper;

import java.util.List;

import ces.entity.DictShow;

public interface DictShowMapper {

	public DictShow getEntityByid(String id) ;

	public void updateEntity(DictShow entity) ;

	public List<DictShow> getList(DictShow entity);

	public void addEntity(DictShow entity) ;
	
}
