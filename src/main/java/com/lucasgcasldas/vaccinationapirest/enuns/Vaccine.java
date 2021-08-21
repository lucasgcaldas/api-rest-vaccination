package com.lucasgcasldas.vaccinationapirest.enuns;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;

@Entity(name = "vacinas")
public class Vaccine {

	private String lab;
	private String name;
	private int lot;
	private Date applicationDate;
	
	public Vaccine() {
	}

	public Vaccine(String lab, String name, int lot, Date applicationDate) {
		super();
		this.lab = lab;
		this.name = name;
		this.lot = lot;
		this.applicationDate = applicationDate;
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLot() {
		return lot;
	}

	public void setLot(int lot) {
		this.lot = lot;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lot, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaccine other = (Vaccine) obj;
		return lot == other.lot && Objects.equals(name, other.name);
	}	
}
