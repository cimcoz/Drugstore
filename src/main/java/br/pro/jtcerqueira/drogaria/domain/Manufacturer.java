package br.pro.jtcerqueira.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Manufacturer extends GenericDomain{
	@Column(length = 50, nullable = false)
	private String description;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescricao(String description) {
		this.description = description;
}
}
