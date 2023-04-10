package br.com.fiap.Execptions;

public class EntityNotFind extends Exception {
	public EntityNotFind() {
		super("A entidade nao foi encontrada");
	}
	
	public EntityNotFind(String mensg) {
		super(mensg);
	}

}
