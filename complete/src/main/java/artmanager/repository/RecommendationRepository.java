package artmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import artmanager.entity.Recommendation;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long>,JpaSpecificationExecutor<Recommendation>{

}
