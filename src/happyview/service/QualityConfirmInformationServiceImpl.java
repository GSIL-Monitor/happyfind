package happyview.service;

import happyview.entity.QualityConfirmInformation;
import happyview.mapper.QualityConfirmInformationMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value="QualityConfirmInformationService")
public class QualityConfirmInformationServiceImpl implements QualityConfirmInformationServiceI {

	private QualityConfirmInformationMapper QualityConfirmInformationMapper;
	
	@Autowired
	public void setQualityConfirmMapper(QualityConfirmInformationMapper QualityConfirmInformationMapper) {
		this.QualityConfirmInformationMapper = QualityConfirmInformationMapper;
	}
	
	
	public QualityConfirmInformationMapper getCotentyingkuiMapper() {
		return QualityConfirmInformationMapper;
	}


	@Override
	public List<QualityConfirmInformation> getList(QualityConfirmInformation qc) {
		return QualityConfirmInformationMapper.getList(qc);
	}


	@Override
	public void addEntity(QualityConfirmInformation qc) {
		QualityConfirmInformationMapper.addEntity(qc);
		
	}
	
	@Override
	public void updateEntity(QualityConfirmInformation qc) {
		QualityConfirmInformationMapper.updateEntity(qc);
		
	}


	@Override
	public QualityConfirmInformation getEntityById(int id) {
		// TODO Auto-generated method stub
		return QualityConfirmInformationMapper.getEntityById(id);
	}


	@Override
	public void deleteEntity(QualityConfirmInformation qc) {
		// TODO Auto-generated method stub
		QualityConfirmInformationMapper.deleteEntity(qc);
	}


}
