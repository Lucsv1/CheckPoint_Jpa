package br.com.fiap.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ORGANIZADORES")
@SequenceGenerator(sequenceName = "SQ_TB_ORGANIZADORES", name = "organizadores", allocationSize = 1)
public class Organizadores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organizadores")
	@Column(name="cd_organizadores")
	private int codigoOrganizadores;
	
	@Column(name="nm_organizador", nullable = false, length = 80)
	private String nomeOrganizadores;
	
	@Column(name = "email_organizador", length = 20)
	private String emailOrganizador;
	
	@Column(name ="tel_organizador", length = 11)
	private String telefoneOrganizador;
	
	@Column(name="end_organizador", nullable = false, length = 80)
	private String enderecoOrganizador;
	
	//---------------------
	
	public Organizadores(String nomeOrganizadores, String emailOrganizador, String telefoneOrganizador,
			String enderecoOrganizador) {
		this.nomeOrganizadores = nomeOrganizadores;
		this.emailOrganizador = emailOrganizador;
		this.telefoneOrganizador = telefoneOrganizador;
		this.enderecoOrganizador = enderecoOrganizador;
	}
	
	//---------------------

	public int getCodigoOrganizadores() {
		return codigoOrganizadores;
	}

	public void setCodigoOrganizadores(int codigoOrganizadores) {
		this.codigoOrganizadores = codigoOrganizadores;
	}

	public String getNomeOrganizadores() {
		return nomeOrganizadores;
	}

	public void setNomeOrganizadores(String nomeOrganizadores) {
		this.nomeOrganizadores = nomeOrganizadores;
	}

	public String getEmailOrganizador() {
		return emailOrganizador;
	}

	public void setEmailOrganizador(String emailOrganizador) {
		this.emailOrganizador = emailOrganizador;
	}

	public String getTelefoneOrganizador() {
		return telefoneOrganizador;
	}

	public void setTelefoneOrganizador(String telefoneOrganizador) {
		this.telefoneOrganizador = telefoneOrganizador;
	}

	public String getEnderecoOrganizador() {
		return enderecoOrganizador;
	}

	public void setEnderecoOrganizador(String enderecoOrganizador) {
		this.enderecoOrganizador = enderecoOrganizador;
	}
	
	

}
