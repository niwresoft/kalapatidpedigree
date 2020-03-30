package com.kalapatids.pedigree.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * Pet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-24T17:55:11.836Z")

public class Pet   {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("gender")
	private String gender = null;

	@JsonProperty("sire")
	private String sire = null;

	@JsonProperty("dam")
	private String dam = null;

	@JsonProperty("dateOfBirth")
	private String dateOfBirth = null;

	@JsonProperty("remarks")
	private String remarks = null;

	@JsonProperty("name")
	private String name = null;


	public Pet id(String id) {
		this.id = id;
		return this;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Pet gender(String gender) {
		this.gender = gender;
		return this;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Pet sire(String sire) {
		this.sire = sire;
		return this;
	}

	public String getSire() {
		return sire;
	}

	public void setSire(String sire) {
		this.sire = sire;
	}

	public Pet dam(String dam) {
		this.dam = dam;
		return this;
	}

	public String getDam() {
		return dam;
	}

	public void setDam(String dam) {
		this.dam = dam;
	}

	public Pet dateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Pet remarks(String remarks) {
		this.remarks = remarks;
		return this;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Pet pet = (Pet) o;
		return Objects.equals(this.id, pet.id) &&
				Objects.equals(this.gender, pet.gender) &&
				Objects.equals(this.sire, pet.sire) &&
				Objects.equals(this.dam, pet.dam) &&
				Objects.equals(this.dateOfBirth, pet.dateOfBirth) &&
				Objects.equals(this.remarks, pet.remarks) &&
				Objects.equals(this.name, pet.name) ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, gender, sire, dam, dateOfBirth, remarks);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Pet {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
		sb.append("    sire: ").append(toIndentedString(sire)).append("\n");
		sb.append("    dam: ").append(toIndentedString(dam)).append("\n");
		sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
		sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

