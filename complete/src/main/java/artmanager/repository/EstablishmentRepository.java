package artmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import artmanager.entity.Establishment;

public interface EstablishmentRepository extends JpaRepository<Establishment, Long>,JpaSpecificationExecutor<Establishment>{

}
