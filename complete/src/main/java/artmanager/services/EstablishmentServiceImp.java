package artmanager.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import artmanager.dto.Establishment;
import artmanager.repository.EstablishmentRepository;
import artmanager.specifications.EstablishmentSpecification;

@Service
@Transactional
public class EstablishmentServiceImp implements EstablishmentService{

	@Autowired
	EstablishmentRepository establishmentRepository;
	
	@Override
	public Establishment create(Establishment object) {
		artmanager.entity.Establishment establishment = new artmanager.entity.Establishment(object);
		Establishment establismentDto= new Establishment(establishmentRepository.save(establishment));
		return establismentDto;
	}

	@Override
	public Boolean delete(Establishment object) {
		artmanager.entity.Establishment establishment = new artmanager.entity.Establishment(object);
		establishmentRepository.delete(establishment);
		return true;
	}

	@Override
	public Establishment update(Establishment object) {
		artmanager.entity.Establishment establishment = new artmanager.entity.Establishment(object);
		Establishment establismentDto= new Establishment(establishmentRepository.save(establishment));
		return establismentDto;
	}

	@Override
	public Establishment get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Establishment> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public List<Establishment> getAllByCompanyId(Long companyId) {
		
		return establishmentListEntityToDto(establishmentRepository.findAll(EstablishmentSpecification.getEstablishmentByCompanyId(companyId)));
	}
	
	@Override
	public List<Establishment> getAllByUserId(Long userId) {
		return establishmentListEntityToDto(establishmentRepository.findAll(EstablishmentSpecification.getEstablishmentByUserId(userId)));
	}
	
	
	private artmanager.dto.Establishment establishmentEntityToDto(artmanager.entity.Establishment establishment) {
		artmanager.dto.Establishment establishmentDto = new artmanager.dto.Establishment(establishment);
		return establishmentDto;
	}

	
	private List<artmanager.dto.Establishment> establishmentListEntityToDto(List<artmanager.entity.Establishment> establishmentList) {
		List<artmanager.dto.Establishment> establishmentDtoList = new ArrayList<artmanager.dto.Establishment>();
		for (artmanager.entity.Establishment establishmentEntity : establishmentList) {
			establishmentDtoList.add(this.establishmentEntityToDto(establishmentEntity));
		}
		return establishmentDtoList;

	}

	@Override
	public List<Establishment> getEstablishmentByUserIdAndCompanyId(Long userId, Long companyId) {
		return establishmentListEntityToDto(establishmentRepository.findAll(EstablishmentSpecification.getEstablishmentByUserIdAndCompanyId(userId,companyId)));
	
	}

	@Override
	public List<Establishment> getEstablishmentByUserNameAndCompanyId(String username, Long companyId) {
		return establishmentListEntityToDto(establishmentRepository.findAll(EstablishmentSpecification.getEstablishmentByUserNameAndCompanyId(username,companyId)));
	}

	

	
	
	

}
