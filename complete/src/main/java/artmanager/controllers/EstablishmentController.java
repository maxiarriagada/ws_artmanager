package artmanager.controllers;

import java.util.ArrayList;
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
import artmanager.dto.Data;
import artmanager.dto.Establishment;
import artmanager.dto.User;
import artmanager.dto.UserCompany;
import artmanager.services.EstablishmentService;

@CrossOrigin
@RestController
@RequestMapping(value = "/establishment")
public class EstablishmentController {
	@Autowired
	EstablishmentService establishmentService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Establishment> create(@RequestBody Establishment establishment) {
		System.out.println("CREATE ESTABLISHMENT");

		Establishment establishmentdto = null;
		try {
			establishmentdto = establishmentService.create(establishment);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<Establishment>(establishmentdto, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Establishment> update(@RequestBody Establishment establishment) {
		System.out.println("UPDATE ESTABLISHMENT");
		Establishment establishmentdto = null;
		try {
			
			establishmentdto = establishmentService.update(establishment);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Establishment>(establishmentdto, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<Establishment> delete(@RequestBody Establishment establishment) {
		System.out.println("DELETE ESTABLISHMENT");

		try {
			establishmentService.delete(establishment);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ResponseEntity<Establishment>(establishment, HttpStatus.OK);

	}

	
	@RequestMapping(method = RequestMethod.GET)
	List<Establishment> getAll() {
		System.out.println("ESTABLISHMENT GET ALL");		
		return  establishmentService.getAll();
	}
	
	
	@RequestMapping(value = "/bycompanyid",method = RequestMethod.POST)
	public List<Establishment> getAllByCompanyId(@RequestBody Company company) {
		System.out.println("get by companyid ESTABLISHMENT");

		List<Establishment> establishmentList = null;
		try {
			establishmentList = establishmentService.getAllByCompanyId(company.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return establishmentList;

	}
	
	
	@RequestMapping(value = "/byuserid",method = RequestMethod.POST)
	//public List<Establishment> getAllByUserId(@RequestBody User user) {
	public List<Data> getAllByUserId(@RequestBody User user) {
		System.out.println("get by userid ESTABLISHMENT");
		if(user.getId()!=null){
			System.out.println("userid: " +user.getId() );
		}
		
		List<Establishment> establishmentList = null;
		
		List<Data> dataList = null;
		try {
			establishmentList = establishmentService.getAllByUserId(user.getId());
			
			dataList = establishmentListToDataList(establishmentList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//return establishmentList;
		return dataList;

	}
	
	@RequestMapping(value = "/byuseridcompanyid",method = RequestMethod.POST)
	public List<Data> getEstablishmentByUserIdAndCompanyId(@RequestBody UserCompany userCompany) {
		System.out.println("getEstablishmentByUserIdAndCompanyId" +"userId: "+ userCompany.getUserId()+"- companyId: "+userCompany.getCompanyId());
		
		List<Establishment> establishmentList = null;
		
		List<Data> dataList = null;
		try {
			establishmentList = establishmentService.getEstablishmentByUserIdAndCompanyId(userCompany.getUserId(),userCompany.getCompanyId());
			
			dataList = establishmentListToDataList(establishmentList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//return establishmentList;
		return dataList;

	}
	
	@RequestMapping(value = "/byusernamecompanyid",method = RequestMethod.POST)
	public List<Data> getEstablishmentByUserNameAndCompanyId(@RequestBody UserCompany userCompany) {
		System.out.println("getEstablishmentByUserNameAndCompanyId" +"userId: "+ userCompany.getUsername()+"- companyId: "+userCompany.getCompanyId());
		
		List<Establishment> establishmentList = null;
		
		List<Data> dataList = null;
		try {
			establishmentList = establishmentService.getEstablishmentByUserNameAndCompanyId(userCompany.getUsername(),userCompany.getCompanyId());
			
			dataList = establishmentListToDataList(establishmentList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//return establishmentList;
		return dataList;

	}
	
	
	
	
	
	private List<artmanager.dto.Data> establishmentListToDataList(List<artmanager.dto.Establishment> establishmentList) {
		List<artmanager.dto.Data> dataList = new ArrayList<artmanager.dto.Data>();
		for (artmanager.dto.Establishment establishment : establishmentList) {
			Data data = new Data(establishment);
			dataList.add(data);
		}
		return dataList;

	}
	
}
