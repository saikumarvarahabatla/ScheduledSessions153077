package com.capgemini.training.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.training.beans.ScheduledSessions;
import com.capgemini.training.daoservices.ITrainingDAO;
import com.capgemini.training.exceptions.TrainingServicesDownException;


@Component(value="trainingServices")	/*Creating a component with value trainingServices which is autowired in TrainingController class*/
public class TrainingServiceImpl implements ITrainingService{

	@Autowired	/*Reference to ITrainginDAO class object*/
	private ITrainingDAO daoServices;

	@Override	/*Implementing the ITrainingService Interface  method*/
	public ArrayList<ScheduledSessions> getAllScheduledSessionDetails() throws TrainingServicesDownException {
		return (ArrayList<ScheduledSessions>) daoServices.findAll();
	}

	

	

}