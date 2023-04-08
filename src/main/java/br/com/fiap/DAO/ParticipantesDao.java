package br.com.fiap.DAO;

import br.com.fiap.Entity.Participantes;

public interface ParticipantesDao {
	
	//CRUD
	
	void cadastrar(Participantes participantes);
	
	Participantes buscar(int id);
	
	void atualizar(Participantes participantes);
	
	void deletar(int id);
	
	void commit();

}
