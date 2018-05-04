package artmanager.specifications;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import artmanager.entity.Establishment;


public class EstablishmentSpecification {
	
	public static Specification<Establishment> getEstablishmentByCompanyId(Long companyId) {
        return new Specification<Establishment>() {
            @Override
            public Predicate toPredicate(Root<Establishment> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                final Collection<Predicate> predicates = new ArrayList<>();
                if (!StringUtils.isEmpty(companyId)) {
                	
                    final Predicate companyIdPredicate = cb.equal(root.get("company").get("id"), companyId);
                    predicates.add(companyIdPredicate);
                	
                }
              
                return cb.or(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }

	
	public static Specification<Establishment> getEstablishmentByUserId(Long userId) {
        return new Specification<Establishment>() {
            @Override
            public Predicate toPredicate(Root<Establishment> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                final Collection<Predicate> predicates = new ArrayList<>();
                if (!StringUtils.isEmpty(userId)) {
                	
                    final Predicate userIdPredicate = cb.equal(root.get("user").get("id"), userId);
                    predicates.add(userIdPredicate);
                	
                }
              
                return cb.or(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
	
	
	public static Specification<Establishment> getEstablishmentByUserIdAndCompanyId(Long userId,Long companyId) {
        return new Specification<Establishment>() {
            @Override
            public Predicate toPredicate(Root<Establishment> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                final Collection<Predicate> predicates = new ArrayList<>();
                if (userId!=null && companyId!=null) {
                    final Predicate userIdPredicate = cb.equal(root.get("user").get("id"), userId);
                    predicates.add(userIdPredicate);
                    
                    final Predicate companyIdPredicate = cb.equal(root.get("company").get("id"), companyId);
                    predicates.add(companyIdPredicate);
                }
              
                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
	
	public static Specification<Establishment> getEstablishmentByUserNameAndCompanyId(String username,Long companyId) {
        return new Specification<Establishment>() {
            @Override
            public Predicate toPredicate(Root<Establishment> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                final Collection<Predicate> predicates = new ArrayList<>();
                if (username!=null && companyId!=null) {
                    final Predicate userIdPredicate = cb.equal(root.get("user").get("username"), username);
                    predicates.add(userIdPredicate);
                    
                    final Predicate companyIdPredicate = cb.equal(root.get("company").get("id"), companyId);
                    predicates.add(companyIdPredicate);
                }
              
                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
	
}
