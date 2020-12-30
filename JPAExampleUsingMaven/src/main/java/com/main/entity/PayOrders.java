package com.main.entity;

import java.io.Serializable;
import java.lang.Byte;
import java.lang.Double;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PayOrders
 *
 */
@Entity
@NamedQuery(name = "findPayOrdersByBranch",
			query = "SELECT p " + 
					" FROM PayOrders p " + 
					" WHERE p.idBranch = :idBranch " + 
					" ORDER BY p.Currency")

public class PayOrders implements Serializable {

	   
	@Id
	private int Id;
	private int idBranch;
	private Double Amount;
	private Byte Currency;
	private Byte Status;
	private String PayDate;
	private static final long serialVersionUID = 1L;

	public PayOrders() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	
	public int getIdBranch() {
		return idBranch;
	}
	public void setIdBranch(int idBranch) {
		this.idBranch = idBranch;
	}
	public Double getAmount() {
		return this.Amount;
	}

	public void setAmount(Double Amount) {
		this.Amount = Amount;
	}   
	public Byte getCurrency() {
		return this.Currency;
	}

	public void setCurrency(Byte Currency) {
		this.Currency = Currency;
	}   
	public Byte getStatus() {
		return this.Status;
	}

	public void setStatus(Byte Status) {
		this.Status = Status;
	}   
	public String getPayDate() {
		return this.PayDate;
	}

	public void setPayDate(String PayDate) {
		this.PayDate = PayDate;
	}
   
}
