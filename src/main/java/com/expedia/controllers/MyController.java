package com.expedia.controllers;
import java.net.URI;

import com.expedia.model.LatLong;
import com.expedia.model.Places;
import com.expedia.model.Types;
import com.expedia.repository.LatLongRepository;
import com.expedia.repository.PlacesRepository;
import com.expedia.repository.TypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.googleapis.pojo.GoogleMapPojo;

  @RestController
public class MyController {

	  @Autowired
	  private TypesRepository typesRepository;

	  @Autowired
	  private LatLongRepository latLongRepository;

	  @Autowired
	  private PlacesRepository placesRepository;

	  @PostMapping("/insert")
	  public ResponseEntity<Object> Insert(@RequestBody UserInput request) {
		  System.out.println("inside insert"+request.getRadius());
		  RestTemplate restTemplate=new RestTemplate();
		  for(String loc:request.getLocation()) {
		  	  String places="";
			  for(String type:request.getType()) {
				  GoogleMapPojo resp=restTemplate.getForObject("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+loc+"&radius="+request.getRadius()+"&type="+type+"&key=AIzaSyBDLxIdVe-oPQCs_odjRMuu8X_AQO0cKO4",GoogleMapPojo.class);
				  if(resp.getResults().size()>0) {
					  System.out.println("aaya=============================="+resp.getResults().get(0).getName());
					  places=places+resp.getResults().get(0).getName();
				   }else {
					  System.out.println("aaya=============================="+resp.getResults().size()+"https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+loc+"&radius="+request.getRadius()+"&type="+type+"&key=AIzaSyBDLxIdVe-oPQCs_odjRMuu8X_AQO0cKO4");
				  }
				  Types usertype=new Types(type);
				  Types typeObj= typesRepository.save(usertype);
				  LatLong userLatLong=new LatLong(loc, request.getRadius(),typeObj.getId());
				  LatLong latLongObj=latLongRepository.save(userLatLong);
				  Places userPlaces=new Places(latLongObj.getId(),places);
				  placesRepository.save(userPlaces);
			  }
		  }
		  return ResponseEntity.accepted().build();
	  }

//  @PostMapping("/insert")
//	public ResponseEntity<Object> CreateLocation(@RequestBody UserSearchResult result) {
//	//UserSearchResult save=service.save(result);
//
//	System.out.println("inside insert"+result.getRadius());
//	RestTemplate restTemplate=new RestTemplate();
//	for(String loc:result.getLocation()) {
//		for(String type:result.getType()) {
//			GoogleMapPojo resp=restTemplate.getForObject("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+loc+"&radius="+result.getRadius()+"&type="+type+"&key=AIzaSyBDLxIdVe-oPQCs_odjRMuu8X_AQO0cKO4",GoogleMapPojo.class);
//			if(resp.getResults().size()>0) {
//			System.out.println("aaya=============================="+resp.getResults().get(0).getName());
//			}else {
//				System.out.println("aaya=============================="+resp.getResults().size()+"https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+loc+"&radius="+result.getRadius()+"&type="+type+"&key=AIzaSyBDLxIdVe-oPQCs_odjRMuu8X_AQO0cKO4");
//
//			}
//		}
//	}
//	//URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{type}").buildAndExpand(save.getType()).toUri();
//
//	//return ResponseEntity.created(location).build();
//	return "";
//	}
}
