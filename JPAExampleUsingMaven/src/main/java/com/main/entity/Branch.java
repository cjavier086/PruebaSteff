package com.main.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Branch
 *
 */
@Entity
@NamedQuery(name = "findBranchByBank",
			query = "SELECT b " + 
					" FROM Branch b " + 
					" WHERE b.idBank = :idBank ")

public class Branch implements Serializable {

	   
	@Id
	private int Id;
	private int idBank;
	private String BranchName;
	private String BranchAddress;
	private String RegDate;
	private static final long serialVersionUID = 1L;

	public Branch() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	
	public int getIdBank() {
		return idBank;
	}
	public void setIdBank(int idBank) {
		this.idBank = idBank;
	}
	public String getBranchName() {
		return this.BranchName;
	}

	public void setBranchName(String BranchName) {
		this.BranchName = BranchName;
	}   
	public String getBranchAddress() {
		return this.BranchAddress;
	}

	public void setBranchAddress(String BranchAddress) {
		this.BranchAddress = BranchAddress;
	}   
	public String getRegDate() {
		return this.RegDate;
	}

	public void setRegDate(String RegDate) {
		this.RegDate = RegDate;
	}
   
}
