package br.com.fiap.DAO;

import br.com.fiap.Execptions.EntityNotFind;
import br.com.fiap.Execptions.ExceptionCommit;

public interface GenericDao<E, K> {
	void cadastrar(E entidade);
	E pesquisar(K id) throws EntityNotFind;
	void deletar(K id) throws EntityNotFind;
	void commit() throws ExceptionCommit;

}
