package artmanager.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import artmanager.dto.Company;
import artmanager.repository.CompanyRepository;
import artmanager.specifications.CompanySpecification;
import artmanager.specifications.EstablishmentSpecification;

@Service
@Transactional
public class CompanyServiceImp implements CompanyService {

	@Autowired
	CompanyRepository companyRepository;

	
	@Override
	public Company create(Company object) {
		artmanager.entity.Company companyEntity = new artmanager.entity.Company(object);
		return companyEntityToDto(companyRepository.save(companyEntity));
	}

	
	@Override
	public Boolean delete(Company object) {
		artmanager.entity.Company companyEntity = new artmanager.entity.Company(object);
		companyRepository.delete(companyEntity);
		return true;
	}

	
	@Override
	public Company update(Company object) {
		artmanager.entity.Company companyEntity = new artmanager.entity.Company(object);
		return companyEntityToDto(companyRepository.save(companyEntity));
	}

	
	@Override
	public Company get(Long id) {
		return companyEntityToDto(companyRepository.getOne(id));
	}

	
	@Override
	public List<Company> getAll() {

		return companyListEntityToDto(companyRepository.findAll());
	}

	
	private artmanager.dto.Company companyEntityToDto(artmanager.entity.Company company) {
		artmanager.dto.Company companyDto = new artmanager.dto.Company(company);
		return companyDto;
	}

	
	private List<artmanager.dto.Company> companyListEntityToDto(List<artmanager.entity.Company> companyList) {
		List<artmanager.dto.Company> companyDtoList = new ArrayList<artmanager.dto.Company>();
		for (artmanager.entity.Company companyEntity : companyList) {
			companyDtoList.add(this.companyEntityToDto(companyEntity));
		}
		return companyDtoList;

	}

	
	@Override
	public List<Company> search(Company company) {
		artmanager.entity.Company companyEntity = new artmanager.entity.Company(company);
		return companyListEntityToDto(companyRepository.findAll(CompanySpecification.search(companyEntity)));
	}


	@Override
	public List<Company> getAllByUserId(Long id) {
		
		return companyListEntityToDto(companyRepository.getCompaniesByUserId(id));
		//return null;
	}


	@Override
	public List<Company> getAllByUserName(String username) {
		// TODO Auto-generated method stub
		return companyListEntityToDto(companyRepository.getCompaniesByUserName(username));
	}

}
