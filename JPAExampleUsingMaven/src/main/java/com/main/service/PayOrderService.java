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

import com.main.entity.PayOrders;

public class PayOrderService {
	
	@PersistenceContext(unitName="PayOrderService", type=PersistenceContextType.TRANSACTION)
	EntityManager entityManager;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createBank(PayOrders payOrder){
		entityManager.persist(payOrder);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public PayOrders read (@PathParam("id") int id){
		return entityManager.find(PayOrders.class, id);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(PayOrders payOrder){
		entityManager.merge(payOrder);
	}
	
	@DELETE
	@Path("{id}")
	public void delete(@PathParam("id") int id){
		PayOrders payOrder = read(id);
		if(null != payOrder){
			entityManager.remove(payOrder);
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("findPayOrdersByBranch/{idBranch}")
	public List<PayOrders> findPayOrdersByBranch(@PathParam("idBranch") int idBranch){
		
		Query query = entityManager.createNamedQuery("findPayOrdersByBranch");
		query.setParameter("idBranch", idBranch);
		return query.getResultList();
	}

}
