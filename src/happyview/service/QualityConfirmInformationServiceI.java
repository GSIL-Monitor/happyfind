package happyview.service;

import java.util.List;

import happyview.entity.QualityConfirmInformation;

public interface QualityConfirmInformationServiceI {
	

	public List<QualityConfirmInformation> getList(QualityConfirmInformation qc);
	public void addEntity(QualityConfirmInformation qc);
	public void updateEntity(QualityConfirmInformation qc);
	public QualityConfirmInformation getEntityById(int id);
	public void deleteEntity(QualityConfirmInformation qc);
	

}
