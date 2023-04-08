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

}
