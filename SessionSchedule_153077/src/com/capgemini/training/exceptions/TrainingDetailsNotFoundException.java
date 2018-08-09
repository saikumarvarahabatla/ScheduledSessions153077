package com.capgemini.training.exceptions;

/*Creating the TrainingDetailsNotFoundExcepiton extending to RuntimeException*/

public class TrainingDetailsNotFoundException extends  RuntimeException {

	

	public TrainingDetailsNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrainingDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public TrainingDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TrainingDetailsNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TrainingDetailsNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	

}