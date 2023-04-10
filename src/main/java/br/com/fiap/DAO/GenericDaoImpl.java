package br.com.fiap.DAO;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.Execptions.EntityNotFind;
import br.com.fiap.Execptions.ExceptionCommit;

public abstract class GenericDaoImpl<E,K> implements GenericDao<E,K> {
	
	private Class<E> clazz;
	private EntityManager ent;
	
	@SuppressWarnings("all")
	public GenericDaoImpl(EntityManager ent) {
		this.ent = ent;
		this.clazz = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void cadastrar(E entidade) {
		ent.merge(entidade);
	}
	
	public E pesquisar(K id) throws EntityNotFind {
		E entidade = ent.find(clazz, id);
		if (entidade == null) {
			throw new EntityNotFind();
		}
		return entidade;
	}
	
	public void deletar (K id) throws EntityNotFind{
		E entidade = pesquisar(id);
		ent.remove(entidade);
	}
	
	public void commit() throws ExceptionCommit{
		try {
			ent.getTransaction().begin();
			ent.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			ent.getTransaction().rollback();
			throw new ExceptionCommit();
		}
	}

}
