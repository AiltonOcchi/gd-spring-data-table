package br.com.glandata.dataTable.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	public Cliente(){
	}

	@Getter @Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String email;

	@Getter @Setter
	private String endereco;
	
	@Getter @Setter
	private String pais;
	
}
