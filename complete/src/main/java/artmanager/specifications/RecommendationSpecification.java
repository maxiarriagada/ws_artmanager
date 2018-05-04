package artmanager.specifications;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;


import artmanager.entity.Recommendation;


public class RecommendationSpecification {

	public static Specification<Recommendation> getRecommendationsByEstablishmentId(Long establishmentid) {
        return new Specification<Recommendation>() {
            @Override
            public Predicate toPredicate(Root<Recommendation> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                final Collection<Predicate> predicates = new ArrayList<>();
                if (!StringUtils.isEmpty(establishmentid)) {
                    final Predicate businessnamePredicate = cb.equal(root.get("establishmentid"), establishmentid);
                    predicates.add(businessnamePredicate);
                }
                
                // ver si esta bien que devuelva solo las altas y no las modificadas que ya deberian estar bien 
                final Predicate filetypePredicate = cb.equal(root.get("filetype"), "A");
                predicates.add(filetypePredicate);
                
                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }

}


