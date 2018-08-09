package com.capgemini.training.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity /* Making ScheduledSessions Class as an Entity */
public class ScheduledSessions {
	@Id
	private int id; /* Creating id as a primary Key */
	private String name, faculty, mode;
	private int duration;
	
	
	public ScheduledSessions() {
	
		// TODO Auto-generated constructor stub
	}
	
	public ScheduledSessions(String name, String faculty, String mode, int duration) {
		super();
		this.name = name;
		this.faculty = faculty;
		this.mode = mode;
		this.duration = duration;
	}
	public ScheduledSessions(int id, String name, String faculty, String mode, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.mode = mode;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + id;
		result = prime * result + ((mode == null) ? 0 : mode.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduledSessions other = (ScheduledSessions) obj;
		if (duration != other.duration)
			return false;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (id != other.id)
			return false;
		if (mode == null) {
			if (other.mode != null)
				return false;
		} else if (!mode.equals(other.mode))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ScheduledSessions [id=" + id + ", name=" + name + ", faculty=" + faculty + ", mode=" + mode
				+ ", duration=" + duration + "]";
	}
	

	

	
}