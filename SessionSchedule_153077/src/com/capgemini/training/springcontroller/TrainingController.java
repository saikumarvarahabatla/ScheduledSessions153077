package com.capgemini.training.springcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.training.beans.ScheduledSessions;
import com.capgemini.training.exceptions.TrainingDetailsNotFoundException;
import com.capgemini.training.exceptions.TrainingServicesDownException;
import com.capgemini.training.services.ITrainingService;

@Controller	/*Making it as a Controller Class*/
public class TrainingController {

	
	@Autowired(required=true)/*Using the Reference of the interface ITrainingService with this annotation*/
	private ITrainingService trainingServices;
	
	@RequestMapping(value="/",method=RequestMethod.GET)	/*Mapping the Request Called by the jsp page and GET the method to the ScheduledSessions Page*/
	public ModelAndView viewSessions() throws TrainingServicesDownException{
		 List<ScheduledSessions> list=trainingServices.getAllScheduledSessionDetails();
	        ModelAndView modelAndView = new ModelAndView("ScheduledSessions","list",list);
			return modelAndView; 
	}
	@RequestMapping(value="/success/{name}",method=RequestMethod.GET)  /*Mapping the Request Called by the ScheduledSessions page and GET the method to the Success Page*/
    public ModelAndView viewSc(@PathVariable String name) throws TrainingServicesDownException, TrainingDetailsNotFoundException { 
       
        ModelAndView modelAndView = new ModelAndView("Success","name",name);
		return modelAndView;  
    } 

	
}
