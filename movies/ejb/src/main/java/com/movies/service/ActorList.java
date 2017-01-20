package com.movies.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.movies.data.ActorRetorno;
import com.movies.model.Actor;

@Stateless
@LocalBean
@Named
public class ActorList {
	
	@PersistenceContext
	private EntityManager em;
	
	public ActorRetorno readAllActor(){
		ActorRetorno retorno = new ActorRetorno();
		
		Query query = em.createNativeQuery("Select * from actor", Actor.class);
		List<Actor> resultado = query.getResultList();
		if (resultado!= null){
			List<String> msgsErro = new ArrayList<String>();
			msgsErro.add("Leitura realizada com sucesso.");
			retorno.setMsgsErro(msgsErro);
			retorno.setTemErro(Boolean.FALSE);
			retorno.setData(resultado);
			return retorno;
		}else
		{
			List<String> msgsErro = new ArrayList<String>();
			msgsErro.add("Erro na consulta");
		retorno.setMsgsErro(msgsErro);
		retorno.setTemErro(Boolean.TRUE);
		retorno.setData(resultado);
		return retorno;
		}
	}

	public ActorRetorno findActorById(long id){
		ActorRetorno retorno = new ActorRetorno();
		
		Query query = em.createNativeQuery("Select * from actor where actor_id = ?", Actor.class).setParameter(1, id);
		List<Actor> resultado = query.getResultList();
		if (resultado!= null){
			List<String> msgsErro = new ArrayList<String>();
			msgsErro.add("Leitura realizada com sucesso.");
			retorno.setMsgsErro(msgsErro);
			retorno.setTemErro(Boolean.FALSE);
			retorno.setData(resultado);
			return retorno;
		}else
		{
			List<String> msgsErro = new ArrayList<String>();
			msgsErro.add("Erro na consulta");
		retorno.setMsgsErro(msgsErro);
		retorno.setTemErro(Boolean.TRUE);
		retorno.setData(resultado);
		return retorno;
		}
	}
}
