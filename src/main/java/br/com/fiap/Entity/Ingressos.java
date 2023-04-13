package br.com.fiap.Entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "cd_evento")
	private Eventos eventos;
	
			
	//---------------------	
	
	public Ingressos() {
		
	}
	
	public Ingressos(double preco, int quantidade, TipoIngressoEnum typeIngresso, Calendar dataVenda) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.typeIngresso = typeIngresso;
		this.dataVenda = dataVenda;
	}

	//---------------------

	public int getCodigoIngresso() {
		return codigoIngresso;
	}

	public void setCodigoIngresso(int codigoIngresso) {
		this.codigoIngresso = codigoIngresso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public TipoIngressoEnum getTypeIngresso() {
		return typeIngresso;
	}

	public void setTypeIngresso(TipoIngressoEnum typeIngresso) {
		this.typeIngresso = typeIngresso;
	}

	public Calendar getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Calendar dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
	
	
}
