package br.com.fiap.Entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.Enum.TipoIngressoEnum;

@Entity
@Table(name ="TB_INGRESSOS")
@SequenceGenerator(allocationSize = 1,sequenceName = "SQ_TB_INGRESSOS", name = "ingressos")
public class Ingressos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingressos")
	private int codigoIngresso;
	
	@Column(name ="preco", precision = 6, scale = 2, nullable = false)
	private double preco;
	
	@Column(name= "quantidadeç", )
	private int quantidade;
	private TipoIngressoEnum typeIngresso;
	private Calendar dataVenda;
	
	
}
