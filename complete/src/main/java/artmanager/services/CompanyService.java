package artmanager.services;



import java.util.List;

import artmanager.dto.Company;

public interface CompanyService extends IService<Company>{
	public List<Company> search(Company company);
	public List<Company> getAllByUserId(Long id);
	public List<Company> getAllByUserName(String username);
}
