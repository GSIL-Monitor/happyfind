package ces.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ces.entity.Roverview;
import ces.mapper.RoverviewMapper;

@Service(value="reportService")
public class ReportServiceImpl implements ReportServiceI {

	private RoverviewMapper roverviewMapper;
	
	@Autowired
	public void setRoverviewMapper(RoverviewMapper roverviewMapper) {
		this.roverviewMapper = roverviewMapper;
	}

	@Override
	public List<Roverview> getList(Roverview entity) {
		// TODO Auto-generated method stub
		List<Roverview> list= roverviewMapper.getList(entity);
		return list;
	}

}
