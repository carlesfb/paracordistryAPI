package com.paracordistry.dto;


/**
 * {
    "name": "Quasi-Cobbed Solomon Bar",
    "information": [
      {
        "description": "Una de esas pulseras complicadas pero cuyo resultado es interesante: la pulsera Quasi-Cobbed Solomon Bar.",
        "colours": "Uno o dos colores.",
        "reversible": "No es reversible.",
        "buckle": "Cierre pl�stico / nylon.",
        "material": "paracord 550",
        "flexibility": "Muy flexible."
      }
    ],
    "additionalInfo": "Este modelo s�lo se fabrica por encargo. Ponte en contacto para determinar la talla y los colores que deseas.",
    "code": "BP-QUASICOBBED",
    "price": 9.95,
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

public class Product {
	String productId;
	String name;
	Information information = new Information();
	String additionalInfo;
	String code;
	String price;
	String category;
	String[] tags;
	String[] images;

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

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information informationArray) {
		this.information = informationArray;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}
	
}
