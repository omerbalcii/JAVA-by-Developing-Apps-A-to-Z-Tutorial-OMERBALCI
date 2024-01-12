package com.bilgeadam.springbootBTS.model;

import java.math.BigDecimal;

public class Bakimlar {
	private long hizmetId;
    private String islemAdi;
    private String urunTipi;
    private BigDecimal ucret;
    private int sureSaat;
	
    public Bakimlar(long hizmetId, String islemAdi, String urunTipi, BigDecimal ucret, int sureSaat) {
		
		this.hizmetId = hizmetId;
		this.islemAdi = islemAdi;
		this.urunTipi = urunTipi;
		this.ucret = ucret;
		this.sureSaat = sureSaat;
	}

	public Bakimlar(String islemAdi, String urunTipi, BigDecimal ucret, int sureSaat) {
		super();
		this.islemAdi = islemAdi;
		this.urunTipi = urunTipi;
		this.ucret = ucret;
		this.sureSaat = sureSaat;
	}

	public Bakimlar() {
		
	}

	public long getHizmetId() {
		return hizmetId;
	}

	public void setHizmetId(long hizmetId) {
		this.hizmetId = hizmetId;
	}

	public String getIslemAdi() {
		return islemAdi;
	}

	public void setIslemAdi(String islemAdi) {
		this.islemAdi = islemAdi;
	}

	public String getUrunTipi() {
		return urunTipi;
	}

	public void setUrunTipi(String urunTipi) {
		this.urunTipi = urunTipi;
	}

	public BigDecimal getUcret() {
		return ucret;
	}

	public void setUcret(BigDecimal ucret) {
		this.ucret = ucret;
	}

	public int getSureSaat() {
		return sureSaat;
	}

	public void setSureSaat(int sureSaat) {
		this.sureSaat = sureSaat;
	}

	@Override
	public String toString() {
		return "Bakimlar [hizmetId=" + hizmetId + ", islemAdi=" + islemAdi + ", urunTipi=" + urunTipi + ", ucret="
				+ ucret + ", sureSaat=" + sureSaat + "]";
	}
	
    
    

}
