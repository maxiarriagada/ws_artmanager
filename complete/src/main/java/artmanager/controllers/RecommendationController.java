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

import artmanager.dto.Recommendation;
import artmanager.services.RecommendationService;


@CrossOrigin
@RestController
@RequestMapping(value = "/recommendation")
public class RecommendationController {

	@Autowired
	RecommendationService recommendationService;
	
	
	@RequestMapping(value = "/getRecommendationsByEstablishmentId",method = RequestMethod.POST)
	public List<Recommendation> getRecommendationsByEstablishmentId(@RequestBody Recommendation recommendation) {
		System.out.println("getRecommendationsByEstablishmentId");

		List<Recommendation> recommendationlist = null;
		try {
			recommendationlist = recommendationService.getRecommendationsByEstablishmentId(recommendation.getEstablishmentid());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return recommendationlist;

	}

}

