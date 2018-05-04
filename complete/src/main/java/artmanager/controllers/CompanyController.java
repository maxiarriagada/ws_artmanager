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

import artmanager.dto.Company;
import artmanager.dto.User;
import artmanager.services.CompanyService;


@CrossOrigin
@RestController
@RequestMapping(value = "/company")
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Company> create(@RequestBody Company company) {
		System.out.println("CREATE COMPANY");

		Company companydto = null;
		try {
			companydto = companyService.create(company);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<Company>(companydto, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Company> update(@RequestBody Company company) {
		System.out.println("UPDATE COMPANY");
		Company companydto = null;
		try {
			
			companydto = companyService.update(company);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Company>(companydto, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Company> delete(@RequestBody Company company) {
		System.out.println("DELETE COMPANY");
		HttpStatus httpStatus = null;
		try {
			companyService.delete(company);
			httpStatus= HttpStatus.OK;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			httpStatus= HttpStatus.CONFLICT;
		}

		return new ResponseEntity<Company>(company, httpStatus);

	}

	
	@RequestMapping(method = RequestMethod.GET)
	List<Company> getAll() {
		System.out.println("COMPANY GET ALL");		
		return  companyService.getAll();
	}
	
	@RequestMapping(value = "/search",method = RequestMethod.POST)
	public List<Company> search(@RequestBody Company company) {
		System.out.println("Search COMPANY");

		List<Company> companylist = null;
		try {
			companylist = companyService.search(company);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return companylist;

	}
	
	@RequestMapping(value = "/getcompanies",method = RequestMethod.POST)
	public List<Company> getCompanies(@RequestBody User user) {
		System.out.println("get by username Company");
				
		List<Company> companytList = null;
		try {
			companytList = companyService.getAllByUserName(user.getUsername());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return companytList;
		
		 //return  companyService.getAll();

	}

}
