package com.paracordistry.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * {
    "name": "Quasi-Cobbed Solomon Bar",
    "information": [
      {
        "description": "Una de esas pulseras complicadas pero cuyo resultado es interesante: la pulsera Quasi-Cobbed Solomon Bar.",
        "colours": "Uno o dos colores.",
        "reversible": "No es reversible.",
        "buckle": "Cierre plastico / nylon.",
        "material": "paracord 550",
        "flexibility": "Muy flexible."
      }
    ],
    "additionalInfo": "Este modelo solo se fabrica por encargo. Ponte en contacto para determinar la talla y los colores que deseas.",
    "code": "BP-QUASICOBBED",
    "price": 9.95,
    "oldPrice": 14.50,
    "category": "Pulseras",
    "tags": [
      "paracord",
      "Quasi-Cobbed",
      "Solomon"
    ],
    "images": ["images/Quasi-Cobbed-Solomon-PARACORDISTRY.COM01.jpg"]
  }
 *
 */

@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID", nullable = false)
	String productId;
	
	@Column(name = "NAME", nullable = false)
	String name;
	
	@Column(name = "CODE", nullable = false)
	String code;
	
	@Column(name = "PRICE", precision = 10, scale = 2)
	Double price;
	
	@Column(name = "OLD_PRICE", precision = 10, scale = 2)
	Double oldPrice;
	
	@Column(name = "CATEGORY")
	String category;
	
	@Column(name = "ADDITIONAL_INFO")
	String additionalInfo;

//	Information information = new Information();
	
//	String[] tags;
//	
//	String[] images;
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(Double oldPrice) {
		this.oldPrice = oldPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	
}
