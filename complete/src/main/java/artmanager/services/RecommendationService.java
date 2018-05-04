package artmanager.services;

import java.util.List;

import artmanager.dto.Recommendation;

public interface RecommendationService extends IService<Recommendation>{
 public List<Recommendation> getRecommendationsByEstablishmentId(Long establishmentid);
}
