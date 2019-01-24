package br.pro.jtcerqueira.drogaria.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Employee extends GenericDomain {
	
	@Column(length = 80, nullable = false)
	private String workerPermit;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date admissionDate;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private People people;
}
