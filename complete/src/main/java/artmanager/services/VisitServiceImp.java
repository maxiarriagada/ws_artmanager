package artmanager.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import artmanager.dto.Visit;
import artmanager.entity.Recommendation;
import artmanager.repository.RecommendationRepository;
import artmanager.repository.VisitRepository;

@Service
@Transactional
public class VisitServiceImp implements VisitService {
	


	@Autowired
	VisitRepository visitRepository;
	@Autowired
	RecommendationRepository recommendationRepository;
	
	@Override
	public Visit create(Visit object) {
		artmanager.entity.Visit visit = new artmanager.entity.Visit(object);
		Visit visitdto = new Visit(visitRepository.save(visit));
		object.setId(visitdto.getId());
		recommendationRepository.save(recommentationDTOListToRecommendationEntity(object));
		return visitdto;
	}
	
	
	private List<Recommendation> recommentationDTOListToRecommendationEntity(Visit visit){
		
		List<Recommendation> list = new ArrayList<Recommendation>();
				
					if(visit.getRecommendations()!=null){
					for (artmanager.dto.Recommendation recommendation : visit.getRecommendations()) {
						recommendation.setEstablishmentid(visit.getEstablishmentid());
						recommendation.setVisitid(visit.getId());
						artmanager.entity.Recommendation r = new artmanager.entity.Recommendation(recommendation);
						list.add(r);
					}
					
				}
		
		return list;
		
	}

	@Override
	public Boolean delete(Visit object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visit update(Visit object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visit get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visit> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visit> search(Visit visit) {
		// TODO Auto-generated method stub
		return null;
	}
}
