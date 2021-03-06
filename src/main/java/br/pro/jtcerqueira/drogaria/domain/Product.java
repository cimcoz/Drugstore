package br.pro.jtcerqueira.drogaria.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Product extends GenericDomain {

	@Column(length = 80, nullable = false)
	private String description;

	@Column(nullable = false)
	private Short quantity;

	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal price;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Manufacturer manufacturer;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

}
