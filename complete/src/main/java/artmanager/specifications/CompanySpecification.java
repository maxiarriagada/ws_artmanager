package artmanager.specifications;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.util.StringUtils;

import artmanager.entity.Company;
import artmanager.entity.User;


public class CompanySpecification {

	public static Specification<Company> search(artmanager.entity.Company companydto) {
        return new Specification<Company>() {
            @Override
            public Predicate toPredicate(Root<Company> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                final Collection<Predicate> predicates = new ArrayList<>();
                if (!StringUtils.isEmpty(companydto.getBusinessname())) {
                    final Predicate businessnamePredicate = cb.like(root.get("businessname"), companydto.getBusinessname()+"%");
                    predicates.add(businessnamePredicate);
                }
                if (!StringUtils.isEmpty(companydto.getCuit())) {
                    final Predicate cuitPredicate = cb.like(root.get("cuit"), companydto.getCuit()+"%");
                    predicates.add(cuitPredicate);
                }

                return cb.or(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }

}


