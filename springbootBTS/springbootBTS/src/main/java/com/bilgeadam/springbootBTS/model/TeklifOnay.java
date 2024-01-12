package com.bilgeadam.springbootBTS.model;

import java.time.LocalDateTime;

public class TeklifOnay {
	private long onayId;
    private Teklifler teklif;
    private Kullanicilar admin;
    private boolean onayDurumu;
    private LocalDateTime tarih;
	
    public TeklifOnay(long onayId, Teklifler teklif, Kullanicilar admin, boolean onayDurumu, LocalDateTime tarih) {
	
		this.onayId = onayId;
		this.teklif = teklif;
		this.admin = admin;
		this.onayDurumu = onayDurumu;
		this.tarih = tarih;
	}

	public TeklifOnay(Teklifler teklif, Kullanicilar admin, boolean onayDurumu, LocalDateTime tarih) {
		
		this.teklif = teklif;
		this.admin = admin;
		this.onayDurumu = onayDurumu;
		this.tarih = tarih;
	}

	public TeklifOnay() {
		
	}

	public long getOnayId() {
		return onayId;
	}

	public void setOnayId(long onayId) {
		this.onayId = onayId;
	}

	public Teklifler getTeklif() {
		return teklif;
	}

	public void setTeklif(Teklifler teklif) {
		this.teklif = teklif;
	}

	public Kullanicilar getAdmin() {
		return admin;
	}

	public void setAdmin(Kullanicilar admin) {
		this.admin = admin;
	}

	public boolean isOnayDurumu() {
		return onayDurumu;
	}

	public void setOnayDurumu(boolean onayDurumu) {
		this.onayDurumu = onayDurumu;
	}

	public LocalDateTime getTarih() {
		return tarih;
	}

	public void setTarih(LocalDateTime tarih) {
		this.tarih = tarih;
	}

	@Override
	public String toString() {
		return "TeklifOnay [onayId=" + onayId + ", teklif=" + teklif + ", admin=" + admin + ", onayDurumu=" + onayDurumu
				+ ", tarih=" + tarih + "]";
	}
	
	

    
}
