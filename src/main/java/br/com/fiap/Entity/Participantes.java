package br.com.fiap.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="TB_PARTICIPANTES")
@SequenceGenerator(sequenceName = "SQ_TB_PARTICIPANTES", allocationSize = 1, name = "participantes")
public class Participantes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "participantes")
	@Column(name ="cd_participante")
	private int codigoParticipante;
	
	@Column(name ="nm_participante", nullable = false, length = 80)
	private String nomeParticipante;
	
	@Column(name ="end_participantes", nullable = false, length = 80)
	private String enderecoParticipante;
	
	@Column(name ="tel_participantes", nullable = false, length = 11)
	private String telefoneParticipante;
	
	@Column(name ="emial_participantes", length = 30)
	private String emailParticipante;

}
