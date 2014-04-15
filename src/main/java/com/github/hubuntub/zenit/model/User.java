package com.github.hubuntub.zenit.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue
	private Long userId;
	private String username;
	private String lastname;
	private Date dateOfBirth;
	
	@OneToMany
	private Set<StepPerHour> stepPerHours;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Set<StepPerHour> getStepPerHours() {
		return stepPerHours;
	}

	public void setStepPerHours(Set<StepPerHour> stepPerHours) {
		this.stepPerHours = stepPerHours;
	}

}
