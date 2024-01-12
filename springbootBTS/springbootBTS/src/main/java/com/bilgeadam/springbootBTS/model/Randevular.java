package com.bilgeadam.springbootBTS.model;

import java.time.LocalDateTime;

public class Randevular {
	private long randevuId;
    private Kullanicilar kullanici;
    private Bakimlar hizmet;
    private String notlar;
    private LocalDateTime tarih;
    private String durum;
	
    public Randevular(long randevuId, Kullanicilar kullanici, Bakimlar hizmet, String notlar, LocalDateTime tarih,
			String durum) {
		
		this.randevuId = randevuId;
		this.kullanici = kullanici;
		this.hizmet = hizmet;
		this.notlar = notlar;
		this.tarih = tarih;
		this.durum = durum;
	}

	public Randevular(Kullanicilar kullanici, Bakimlar hizmet, String notlar, LocalDateTime tarih, String durum) {
		super();
		this.kullanici = kullanici;
		this.hizmet = hizmet;
		this.notlar = notlar;
		this.tarih = tarih;
		this.durum = durum;
	}

	public Randevular() {
		
	}

	public long getRandevuId() {
		return randevuId;
	}

	public void setRandevuId(long randevuId) {
		this.randevuId = randevuId;
	}

	public Kullanicilar getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanicilar kullanici) {
		this.kullanici = kullanici;
	}

	public Bakimlar getHizmet() {
		return hizmet;
	}

	public void setHizmet(Bakimlar hizmet) {
		this.hizmet = hizmet;
	}

	public String getNotlar() {
		return notlar;
	}

	public void setNotlar(String notlar) {
		this.notlar = notlar;
	}

	public LocalDateTime getTarih() {
		return tarih;
	}

	public void setTarih(LocalDateTime tarih) {
		this.tarih = tarih;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	@Override
	public String toString() {
		return "Randevular [randevuId=" + randevuId + ", kullanici=" + kullanici + ", hizmet=" + hizmet + ", notlar="
				+ notlar + ", tarih=" + tarih + ", durum=" + durum + "]";
	}
	
	
    
	
    
   
}
