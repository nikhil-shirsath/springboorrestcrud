package com.nikhilcdac.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhilcdac.restapi.entities.Candidate;
import com.nikhilcdac.restapi.service.CandidateService;

@RestController
@RequestMapping("/api")
public class CandidateController {
	@Autowired
	private CandidateService cservice;
	
	@GetMapping("/candidates")
	public List<Candidate> getAllCandidates(){
		return cservice.getAll();
	}
	
	@GetMapping("/candidate/{id}")
	public Candidate getCandidate(@PathVariable int id ) {
		
		Optional<Candidate> candidate =  cservice.getCandidate(id);
		if(candidate.isPresent()) {
			return candidate.get();
		}
		return null;
	}
	 	
	@PostMapping("/candidate/add")
	
	public boolean addCandidate(@RequestBody Candidate candidate) {
		return cservice.addCandidate(candidate);
	}

	@PutMapping("/candidate/update/{id}")
	public boolean updateCandidate(@PathVariable int id,@RequestBody Candidate candidate ) {

		return cservice.updateCandidate(id,candidate);
	}
	
	@DeleteMapping("/candidate/delete/{id}")
	public boolean deleteCandidate(@PathVariable int id) {

		return cservice.deleteCandidate(id);
	}
}
