package br.com.fiap.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="TB_LOCAIS")
@SequenceGenerator(sequenceName ="SQ_TB_LOCAIS", allocationSize = 1, name = "locais")
public class Locais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locais")
	@Column(name="cd_local")
	private int codigoLocal;
	
	@Column(name="nm_local", nullable = false, length = 80)
	private String nomeLocal;
	
	@Column(name="end_local", nullable = false, length = 80)
	private String enderecoLocal;
	
	@Column(name ="capacidade", nullable = false, length = 80)
	private int capacidadePessoas;
	
	//---------------------
	
	public Locais(String nomeLocal, String enderecoLocal, int capacidadePessoas) {
		this.nomeLocal = nomeLocal;
		this.enderecoLocal = enderecoLocal;
		this.capacidadePessoas = capacidadePessoas;
	}

	//---------------------

	public int getCodigoLocal() {
		return codigoLocal;
	}

	public void setCodigoLocal(int codigoLocal) {
		this.codigoLocal = codigoLocal;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}

	public String getEnderecoLocal() {
		return enderecoLocal;
	}

	public void setEnderecoLocal(String enderecoLocal) {
		this.enderecoLocal = enderecoLocal;
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	
	
}
