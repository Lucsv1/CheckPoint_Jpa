package br.com.fiap.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.Enum.TipoEventoEnum;

@Entity
@Table(name="TB_EVENTOS")
@SequenceGenerator(sequenceName = "SQ_TB_EVENTOS", allocationSize = 1, name = "eventos")
public class Eventos {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "eventos" )
	@Column(name ="cd_evento")
	private int codigoEvento;
	
	@Column(name="nm_evento", nullable = false, length = 40)
	private String nomeEvento;
	
	@Column(name="organizador", nullable = false, length = 20)
	private String organizador;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tp_evento")
	private TipoEventoEnum typeEvent;
	
	//---------------

	public int getCodigoEvento() {
		return codigoEvento;
	}

	public void setCodigoEvento(int codigoEvento) {
		this.codigoEvento = codigoEvento;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getOrganizador() {
		return organizador;
	}

	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}

	public TipoEventoEnum getTypeEvent() {
		return typeEvent;
	}

	public void setTypeEvent(TipoEventoEnum typeEvent) {
		this.typeEvent = typeEvent;
	}
	
	
	
	

}
