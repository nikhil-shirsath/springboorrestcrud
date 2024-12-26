package com.nikhilcdac.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhilcdac.restapi.dao.ICandidateDao;
import com.nikhilcdac.restapi.entities.Candidate;

@Service
public class CandidateService {

	@Autowired
	private ICandidateDao cdao;

	public List<Candidate> getAll() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}

	public Optional<Candidate> getCandidate(int id) {
		// TODO Auto-generated method stub
		return cdao.findById(id);
	}

	public boolean addCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		Candidate cnd =  cdao.save(candidate);
		if(cnd!=null) {
			return true;
		}
		return false;
	}

	public boolean updateCandidate(int id, Candidate candidate) {
		// TODO Auto-generated method stub
		try {
		Optional<Candidate> isPresentCandidate = getCandidate(id);
		if(isPresentCandidate.isPresent()==false) {
			return false;
		}
		Candidate currentCandidate = isPresentCandidate.get();
		currentCandidate.setRoll(candidate.getRoll());
		currentCandidate.setName(candidate.getName());
		currentCandidate.setMobile(candidate.getMobile());
		currentCandidate.setAddress(candidate.getAddress());
		cdao.save(currentCandidate);
		
		return true;
		}catch(Exception e ) {
			System.err.println("Error occured during update details"+e.getMessage());
			return false;
		}
	}

	public boolean deleteCandidate(int id) {
		// TODO Auto-generated method stub
		try {
			Optional<Candidate> candidate = cdao.findById(id);
			
			if(candidate.isPresent()) {
				cdao.delete(candidate.get());
				return true;
			}
			return false;
			
		}catch(Exception e) {
			System.err.println("Error occurred during delete"+e.getMessage());
		}
		return false;
	}
	
	
}
