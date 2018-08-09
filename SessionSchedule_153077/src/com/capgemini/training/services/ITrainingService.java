package com.capgemini.training.services;

import java.util.ArrayList;

import com.capgemini.training.beans.ScheduledSessions;
import com.capgemini.training.exceptions.TrainingServicesDownException;

public interface ITrainingService {

	ArrayList<ScheduledSessions> getAllScheduledSessionDetails()throws TrainingServicesDownException;	/*Creating  getAllScheduledSessionDetails method with ArrayList as Return Type*/

}