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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import artmanager.dto.Visit;
import artmanager.services.VisitService;


@CrossOrigin
@RestController
@RequestMapping(value = "/visit")
public class VisitController {

	@Autowired
	VisitService visitService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Visit> create(@RequestBody Visit visit) {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json=null;
		try {
			json = ow.writeValueAsString(visit);
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Visit Controller - Create Visit" + json);
		try {
			
			visit = visitService.create(visit);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<Visit>(visit, HttpStatus.OK);
	}

	
	
	@RequestMapping(method = RequestMethod.GET)
	List<Visit> getAll() {
		System.out.println("COMPANY GET ALL");		
		return  visitService.getAll();
	}
	
	@RequestMapping(value = "/search",method = RequestMethod.POST)
	public List<Visit> search(@RequestBody Visit visit) {
		System.out.println("Search COMPANY");

		List<Visit> visitlist = null;
		try {
			visitlist = visitService.search(visit);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return visitlist;

	}

}
