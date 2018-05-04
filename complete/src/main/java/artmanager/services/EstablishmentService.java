package artmanager.services;

import java.util.List;

public interface EstablishmentService extends IService<artmanager.dto.Establishment> {
	
	public List<artmanager.dto.Establishment> getAllByCompanyId(Long companyId);
	public List<artmanager.dto.Establishment> getAllByUserId(Long userId);
	
	public List<artmanager.dto.Establishment> getEstablishmentByUserIdAndCompanyId(Long userId,Long companyId);
	
	public List<artmanager.dto.Establishment> getEstablishmentByUserNameAndCompanyId(String username,Long companyId);
											 

}
