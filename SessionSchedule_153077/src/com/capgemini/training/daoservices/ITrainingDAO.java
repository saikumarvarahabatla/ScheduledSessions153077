package com.capgemini.training.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.training.beans.ScheduledSessions;

public interface ITrainingDAO extends JpaRepository<ScheduledSessions, Integer>{
	
}