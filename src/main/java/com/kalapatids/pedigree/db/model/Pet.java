package com.kalapatids.pedigree.db.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "Pet" database table.
 * 
 */
@Entity
@Table(name="\"pet\"") 
public class Pet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"DAM_ID\"")
	private String damId;

	@Temporal(TemporalType.DATE)
	@Column(name="\"DOB\"")
	private Date dob;

	@Column(name="\"GENDER\"")
	private String gender;

	@Id
	@Column(name="\"PET_ID\"")
	private String petId;

	@Column(name="\"REMARKS\"")
	private String remarks;

	@Column(name="\"SIRE_ID\"")
	private String sireId;
	
	@Column(name="\"NAME\"")
	private String name;

	public Pet() {
	}

	public String getDamId() {
		return this.damId;
	}

	public void setDamId(String damId) {
		this.damId = damId;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPetId() {
		return this.petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSireId() {
		return this.sireId;
	}

	public void setSireId(String sireId) {
		this.sireId = sireId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}