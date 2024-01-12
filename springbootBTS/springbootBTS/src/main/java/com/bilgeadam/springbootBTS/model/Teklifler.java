package com.bilgeadam.springbootBTS.model;

import java.math.BigDecimal;

public class Teklifler {
	private long teklifId;
    private Kullanicilar kullanici;
    private String urunTipi;
    private String notlar;
    private BigDecimal fiyat;
    private String durum;
	
    public Teklifler(long teklifId, Kullanicilar kullanici, String urunTipi, String notlar, BigDecimal fiyat,
			String durum) {
		
		this.teklifId = teklifId;
		this.kullanici = kullanici;
		this.urunTipi = urunTipi;
		this.notlar = notlar;
		this.fiyat = fiyat;
		this.durum = durum;
	}
	public Teklifler(Kullanicilar kullanici, String urunTipi, String notlar, BigDecimal fiyat, String durum) {
		
		this.kullanici = kullanici;
		this.urunTipi = urunTipi;
		this.notlar = notlar;
		this.fiyat = fiyat;
		this.durum = durum;
	}
	public Teklifler() {
		
	}
	public long getTeklifId() {
		return teklifId;
	}
	public void setTeklifId(long teklifId) {
		this.teklifId = teklifId;
	}
	public Kullanicilar getKullanici() {
		return kullanici;
	}
	public void setKullanici(Kullanicilar kullanici) {
		this.kullanici = kullanici;
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
	public String getDurum() {
		return durum;
	}
	public void setDurum(String durum) {
		this.durum = durum;
	}
	@Override
	public String toString() {
		return "Teklifler [teklifId=" + teklifId + ", kullanici=" + kullanici + ", urunTipi=" + urunTipi + ", notlar="
				+ notlar + ", fiyat=" + fiyat + ", durum=" + durum + "]";
	}
	
	

}
