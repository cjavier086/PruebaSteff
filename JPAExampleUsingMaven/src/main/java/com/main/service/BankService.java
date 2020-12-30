package com.main.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.main.entity.Bank;

@Path("/bank")
public class BankService {
	
	@PersistenceContext(unitName="BankService", type=PersistenceContextType.TRANSACTION)
	EntityManager entityManager;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createBank(Bank bank){
		entityManager.persist(bank);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Bank read (@PathParam("id") int id){
		return entityManager.find(Bank.class, id);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(Bank bank){
		entityManager.merge(bank);
	}
	
	@DELETE
	@Path("{id}")
	public void delete(@PathParam("id") int id){
		Bank bank = read(id);
		if(null != bank){
			entityManager.remove(bank);
		}
	}
	
	

}
