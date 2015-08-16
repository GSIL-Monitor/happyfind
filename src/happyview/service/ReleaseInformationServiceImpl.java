package happyview.service;


import happyview.entity.ReleaseInformation;
import happyview.mapper.ReleaseInformationMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value="releaseInformationService")
public class ReleaseInformationServiceImpl implements ReleaseInformationServiceI {

	private ReleaseInformationMapper releaseInformationMapper;
	
	@Autowired
	public void setRewardMapper(ReleaseInformationMapper releaseInformationMapper) {
		this.releaseInformationMapper = releaseInformationMapper;
	}
	
	
	public ReleaseInformationMapper getReleaseMapper() {
		return releaseInformationMapper;
	}


	@Override
	public List<ReleaseInformation> getList(ReleaseInformation bf) {
		return releaseInformationMapper.getList(bf);
	}


	@Override
	public void addEntity(ReleaseInformation bf) {
		releaseInformationMapper.addEntity(bf);
		
	}
	
	@Override
	public void updateEntity(ReleaseInformation bf) {
		releaseInformationMapper.updateEntity(bf);
		
	}


	@Override
	public ReleaseInformation getEntityById(int rewardId) {
		// TODO Auto-generated method stub
		return releaseInformationMapper.getEntityById(rewardId);
	}


	@Override
	public void deleteEntity(ReleaseInformation bf) {
		// TODO Auto-generated method stub
		releaseInformationMapper.deleteEntity(bf);
	}


}
