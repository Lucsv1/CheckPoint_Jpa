package br.com.fiap.DAO;

public interface GenericDao<E, K> {
	void cadastrar(E entidade);
	E pesquisar(K id);
	void deletar(K id);
	void commit();

}
