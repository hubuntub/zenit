package com.github.hubuntub.zenit.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class StepPerHour implements Serializable {

	@Id
	@GeneratedValue
	private Long stepId;
	private Long value;
	private Date date;
	public Long getStepId() {
		return stepId;
	}
	public void setStepId(Long stepId) {
		this.stepId = stepId;
	}
	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
