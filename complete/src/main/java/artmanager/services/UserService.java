package artmanager.services;

import artmanager.dto.User;

public interface UserService extends IService<User>{
	

	public User login(User user);
	public User logout(User user);
	
	
}