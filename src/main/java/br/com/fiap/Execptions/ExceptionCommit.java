package br.com.fiap.Execptions;

public class ExceptionCommit extends Exception{
	public ExceptionCommit() {
		super("Commit com erro");
	}
	
	public ExceptionCommit(String mensg) {
		super(mensg);
	}

}
