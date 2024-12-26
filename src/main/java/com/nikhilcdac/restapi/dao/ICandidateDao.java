package com.nikhilcdac.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhilcdac.restapi.entities.Candidate;

public interface ICandidateDao extends JpaRepository<Candidate, Integer> {

}
