package com.scp.hospital;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.*;

@Entity
@Table(name = "table_per_sub_class1")

public class Dental extends Hospital {

	@PrimaryKeyJoinColumn(name = "Patient_id")
	@Column(name = "disese_name")
	private String disese_name;

	@Column(name = "fees")
	private int fees;

	public String getDisese_name() {
		return disese_name;
	}

	public void setDisese_name(String disese_name) {
		this.disese_name = disese_name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public Dental(String disese_name, int fees) {
		super();
		this.disese_name = disese_name;
		this.fees = fees;
	}

}
