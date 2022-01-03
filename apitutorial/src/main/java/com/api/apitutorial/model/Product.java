package com.api.apitutorial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column(name = "ad")
private String ad;
	@Column(name = "adet")
private String adet;
	@Column(name = "fiyat")
private String fiyat;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAd() {
	return ad;
}
public void setAd(String ad) {
	this.ad = ad;
}
public String getAdet() {
	return adet;
}
public void setAdet(String adet) {
	this.adet = adet;
}
public String getFiyat() {
	return fiyat;
}
public void setFiyat(String fiyat) {
	this.fiyat = fiyat;
}

}
