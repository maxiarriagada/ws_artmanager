package artmanager.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import artmanager.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	 @Query(value="SELECT * FROM user WHERE user.username=:username AND user.password=:password", nativeQuery=true)
	 public User login(@Param("username") String username,@Param("password") String password);
	 
	 
	
	 

}
