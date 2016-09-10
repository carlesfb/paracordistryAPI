package com.paracordistry.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_INFO")
public class Information {

//	"description": "Una de esas pulseras complicadas pero cuyo resultado es interesante: la pulsera Quasi-Cobbed Solomon Bar.",
//    "colours": "Uno o dos colores.",
//    "reversible": "No es reversible.",
//    "buckle": "Cierre pl�stico / nylon.",
//    "material": "paracord 550",
//    "flexibility": "Muy flexible."
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_INFO_ID")
	String productInfoId;
	
	@Column(name = "DESCRIPTION")
	String description;
	
	@Column(name = "COLOURS")
	String colours;
	
	@Column(name = "REVERSIBLE")
	String reversible;
	
	@Column(name = "BUCKLE")
	String buckle;
	
	@Column(name = "MATERIAL")
	String material;
	
	@Column(name = "FLEXIBILITY")
	String flexibility;
	
	@Column(name = "ADDITIONAL_INFO")
	String additionalInfo;

	public String getProductInfoId() {
		return productInfoId;
	}

	public void setProductInfoId(String productInfoId) {
		this.productInfoId = productInfoId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColours() {
		return colours;
	}

	public void setColours(String colours) {
		this.colours = colours;
	}

	public String getReversible() {
		return reversible;
	}

	public void setReversible(String reversible) {
		this.reversible = reversible;
	}

	public String getBuckle() {
		return buckle;
	}

	public void setBuckle(String buckle) {
		this.buckle = buckle;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getFlexibility() {
		return flexibility;
	}

	public void setFlexibility(String flexibility) {
		this.flexibility = flexibility;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	
}
