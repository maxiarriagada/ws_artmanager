package artmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import artmanager.entity.Visit;

public interface VisitRepository extends JpaRepository<Visit, Long>,JpaSpecificationExecutor<Visit>{

}
