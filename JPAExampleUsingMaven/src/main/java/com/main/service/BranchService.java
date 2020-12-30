package com.main.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.main.entity.Branch;
import com.main.entity.PayOrders;

public class BranchService {
	
	@PersistenceContext(unitName="BranchService", type=PersistenceContextType.TRANSACTION)
	EntityManager entityManager;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createBank(Branch branch){
		entityManager.persist(branch);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Branch read (@PathParam("id") int id){
		return entityManager.find(Branch.class, id);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(Branch branch){
		entityManager.merge(branch);
	}
	
	@DELETE
	@Path("{id}")
	public void delete(@PathParam("id") int id){
		Branch branch = read(id);
		if(null != branch){
			entityManager.remove(branch);
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findBranchByBank/{idBank}")
	public List<Branch> findBranchByBank(@PathParam("idBank") int idBank){
		
		Query query = entityManager.createNamedQuery("findBranchByBank");
		query.setParameter("idBank", idBank);
		return query.getResultList();
	}
}
