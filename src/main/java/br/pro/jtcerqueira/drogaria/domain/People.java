package br.pro.jtcerqueira.drogaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class People extends GenericDomain {

	@Column(length = 80, nullable = false)
	private String name;

	@Column(length = 30, nullable = false)
	private String social_security;

	@Column(length = 30, nullable = false)
	private String id;

	@Column(length = 100, nullable = false)
	private String street;

	@Column(nullable = false)
	private Short number;

	@Column(length = 80, nullable = false)
	private String neighborhood;

	@Column(length = 30, nullable = false)
	private String zip;

	@Column(length = 80, nullable = false)
	private String complement;

	@Column(length = 20, nullable = false)
	private String phone;

	@Column(length = 20, nullable = false)
	private String cell_phone;

	@Column(length = 100, nullable = false)
	private String email;

	@ManyToOne 
	@JoinColumn (nullable = false)
	private City city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocial_security() {
		return social_security;
	}

	public void setSocial_security(String social_security) {
		this.social_security = social_security;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Short getNumber() {
		return number;
	}

	public void setNumber(Short number) {
		this.number = number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCell_phone() {
		return cell_phone;
	}

	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
