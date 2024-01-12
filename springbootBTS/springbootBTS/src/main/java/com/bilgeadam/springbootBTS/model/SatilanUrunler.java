package com.bilgeadam.springbootBTS.model;

import java.math.BigDecimal;

public class SatilanUrunler {
	private long satisId;
    private Kullanicilar admin;
    private String urunTipi;
    private String notlar;
    private BigDecimal fiyat;
	public SatilanUrunler(long satisId, Kullanicilar admin, String urunTipi, String notlar, BigDecimal fiyat) {
		
		this.satisId = satisId;
		this.admin = admin;
		this.urunTipi = urunTipi;
		this.notlar = notlar;
		this.fiyat = fiyat;
	}
	public SatilanUrunler(Kullanicilar admin, String urunTipi, String notlar, BigDecimal fiyat) {
		super();
		this.admin = admin;
		this.urunTipi = urunTipi;
		this.notlar = notlar;
		this.fiyat = fiyat;
	}
	public SatilanUrunler() {
	
	}
	public long getSatisId() {
		return satisId;
	}
	public void setSatisId(long satisId) {
		this.satisId = satisId;
	}
	public Kullanicilar getAdmin() {
		return admin;
	}
	public void setAdmin(Kullanicilar admin) {
		this.admin = admin;
	}
	public String getUrunTipi() {
		return urunTipi;
	}
	public void setUrunTipi(String urunTipi) {
		this.urunTipi = urunTipi;
	}
	public String getNotlar() {
		return notlar;
	}
	public void setNotlar(String notlar) {
		this.notlar = notlar;
	}
	public BigDecimal getFiyat() {
		return fiyat;
	}
	public void setFiyat(BigDecimal fiyat) {
		this.fiyat = fiyat;
	}
	@Override
	public String toString() {
		return "SatilanUrunler [satisId=" + satisId + ", admin=" + admin + ", urunTipi=" + urunTipi + ", notlar="
				+ notlar + ", fiyat=" + fiyat + "]";
	}
	
	
    

}
