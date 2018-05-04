package artmanager.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import artmanager.dto.Recommendation;
import artmanager.repository.RecommendationRepository;
import artmanager.specifications.RecommendationSpecification;


@Service
@Transactional
public class RecommendationServiceImp implements RecommendationService{

	@Autowired
	RecommendationRepository recommendationRepository;
	
	@Override
	public List<Recommendation> getRecommendationsByEstablishmentId(Long establishmentid) {
		
		return recommendationListEntityToDto(recommendationRepository.findAll(RecommendationSpecification.getRecommendationsByEstablishmentId(establishmentid)));
	}
	
	private List<artmanager.dto.Recommendation> recommendationListEntityToDto(List<artmanager.entity.Recommendation> recommendationList) {
		List<artmanager.dto.Recommendation> companyDtoList = new ArrayList<artmanager.dto.Recommendation>();
		for (artmanager.entity.Recommendation recommendationEntity : recommendationList) {
			Recommendation r = new Recommendation(recommendationEntity);
			companyDtoList.add(r);
		}
		return companyDtoList;

	}
	
	@Override
	public Recommendation create(Recommendation object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Recommendation object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recommendation update(Recommendation object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recommendation get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recommendation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}




}
