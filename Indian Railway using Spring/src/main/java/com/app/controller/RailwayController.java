package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Railway;
import com.app.service.RailwayService;

@RestController
@RequestMapping("/railway")
@CrossOrigin(origins = "http://localhost:3000")
public class RailwayController {
	
	@Autowired
	private RailwayService railwayService;
	
	@PostMapping
	public Railway addNewRailway(@RequestBody Railway newRailway) {
		System.out.println("1");
		return railwayService.addNewRailway(newRailway);
	}
	
	@GetMapping
	public List<Railway> listRailwayDetails(){
		System.out.println("3");
		return railwayService.getAllRailways();
	}
	
	@DeleteMapping("/{railwayId}")
	public String deleteRailwayDetails(@PathVariable Long railwayId) {
		return railwayService.deleteRailwayDetails(railwayId);
	}
	
	@GetMapping("/{railwayId}")
	public Railway getRailwayDetails(@PathVariable Long railwayId) {
		return railwayService.getRailwayDetails(railwayId);
	}
	
	@PutMapping
	public Railway updateRailwayDetails(@RequestBody Railway railway) {
		return railwayService.updateRailwayDetails(railway);
	}
}
