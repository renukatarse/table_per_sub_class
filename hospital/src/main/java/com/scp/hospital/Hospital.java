package com.scp.hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "table_per_sub_class")
@Inheritance(strategy = InheritanceType.JOINED)

public class Hospital {
	@Id
	@GeneratedValue
	@Column(name = "Patient_id")
	private int patientId;

	@Column(name = "FIRSTNAME")
	private String firstname;

	@Column(name = "LASTNAME")
	private String lastname;

	public Hospital(int patientId, String firstname, String lastname) {
		super();
		this.patientId = patientId;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
