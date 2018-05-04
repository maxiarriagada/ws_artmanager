package artmanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import artmanager.dto.User;
import artmanager.services.UserService;

@CrossOrigin
@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<User> login(@RequestBody User user) {
		System.out.println("Login User: " + user.getUsername());
		User usersession = null;
		try {
			 usersession = userService.login(user);
			 if(usersession!=null){
				if (usersession.getUid() != null && !usersession.getUid().equals("")) {
					System.out.println("Logueado uid: " + usersession.getUid());
				}
			 }else
				{	
					
				}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return new ResponseEntity<User>(usersession, HttpStatus.OK);

	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public ResponseEntity<User> logOut(@RequestBody User user) {
		System.out.println("LogOut - userid: "+ user.getId());
		try {

			 userService.logout(user);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.GET)
	List<User> getAll() {
		return userService.getAll();
	}

	
	@RequestMapping(value = "/create",method = RequestMethod.POST)
	public ResponseEntity<User> create(@RequestBody User user) {
		System.out.println("create");

		
		try {
			
			user = userService.create(user);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<User> update(@RequestBody User user) {
		System.out.println("update");
		User userdto = null;
		try {
			userdto = userService.update(user);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<User>(userdto, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<User> delete(@RequestBody User user) {
		System.out.println("DELETE");

		try {
			 userService.delete(user);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ResponseEntity<User>(user, HttpStatus.OK);

	}
	
	
}
