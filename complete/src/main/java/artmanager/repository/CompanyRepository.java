package artmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import artmanager.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>, JpaSpecificationExecutor<Company>{

	
	 @Query(value="SELECT c.* FROM company c,company_user cu WHERE c.id = cu.company_id AND cu.user_id = :userid ORDER BY c.businessname ASC", nativeQuery=true)
	 public List<Company> getCompaniesByUserId(@Param("userid") Long userid);
	 
	 @Query(value="SELECT c.* FROM company c,company_user cu WHERE c.id = cu.company_id AND cu.username = :username ORDER BY c.businessname ASC", nativeQuery=true)
	 public List<Company> getCompaniesByUserName(@Param("username") String username);
	 
	
}
