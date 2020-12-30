package com.main.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bank
 *
 */
@Entity

public class Bank implements Serializable {

	   
	@Id
	private int id;
	private String BankName;
	private String BankAddress;
	private String RegDate;
	private static final long serialVersionUID = 1L;

	public Bank() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getBankName() {
		return this.BankName;
	}

	public void setBankName(String BankName) {
		this.BankName = BankName;
	}   
	public String getBankAddress() {
		return this.BankAddress;
	}

	public void setBankAddress(String BankAddress) {
		this.BankAddress = BankAddress;
	}   
	public String getRegDate() {
		return this.RegDate;
	}

	public void setRegDate(String RegDate) {
		this.RegDate = RegDate;
	}
   
}
