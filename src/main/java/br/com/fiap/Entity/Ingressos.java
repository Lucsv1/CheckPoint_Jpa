package br.com.fiap.Entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fiap.Enum.TipoIngressoEnum;

@Entity
@Table(name ="TB_INGRESSOS")
@SequenceGenerator(allocationSize = 1,sequenceName = "SQ_TB_INGRESSOS", name = "ingressos")
public class Ingressos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingressos")
	@Column(name ="cd_ingresso")
	private int codigoIngresso;
	
	@Column(name ="preco_ingressos", precision = 6, scale = 2, nullable = false)
	private double preco;
	
	@Column(name= "qnt_ingressos", length = 30, nullable = false)
	private int quantidade;
	
	@Enumerated(EnumType.STRING)
	@Column(name ="tp_ingresso", nullable = false)
	private TipoIngressoEnum typeIngresso;
	
	@Temporal(TemporalType.DATE)
	@Column(name ="dt_venda", nullable = false )
	private Calendar dataVenda;
	
	
}
