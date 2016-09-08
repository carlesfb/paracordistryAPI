package com.paracordistry.models;

public class Information {

//	"description": "Una de esas pulseras complicadas pero cuyo resultado es interesante: la pulsera Quasi-Cobbed Solomon Bar.",
//    "colours": "Uno o dos colores.",
//    "reversible": "No es reversible.",
//    "buckle": "Cierre pl�stico / nylon.",
//    "material": "paracord 550",
//    "flexibility": "Muy flexible."
	
	String description;
	String colours;
	String reversible;
	String buckle;
	String material;
	String flexibility;
	
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
}
