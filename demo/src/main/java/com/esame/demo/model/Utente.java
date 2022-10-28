package com.esame.demo.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name =  "utenti")

public class Utente {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id;

	@Column ( name = "nome")
	private String nome;
	@Column ( name = "cognome")
	private String cognome;
	@Column ( name = "email",unique = true)
	protected String email;
	@Column ( name = "cf")
	private String cf;
	@Column ( name = "data_di_nascita")
	private Date dataNascita;
	@Column( name = "sesso")
	private String sesso;
	
	

	
}
