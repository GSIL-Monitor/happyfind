package ces.service;

import java.util.ArrayList;
import java.util.List;

import ces.entity.DictShow;

public interface DictShowServiceI {

	void addEntity(DictShow entity);

	List<DictShow> getList(DictShow entity);

	DictShow getEntityByid(String id);

	void updateEntity(DictShow entity);
	void delEntity(String id);

	void uploadfileAdd(ArrayList<ArrayList<String>> arrList, String channel);

}
