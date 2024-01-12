package com.bilgeadam.springbootBTS.model;

public class Kullanicilar {
	  private long kullaniciId;
	    private String kullaniciAdi;
	    private String email;
	    private String sifre;
	    private String rol;
	    
	    
	    
		public Kullanicilar() {
			
		}
		public Kullanicilar(long kullaniciId, String kullaniciAdi, String email, String sifre, String rol) {
			
			this.kullaniciId = kullaniciId;
			this.kullaniciAdi = kullaniciAdi;
			this.email = email;
			this.sifre = sifre;
			this.rol = rol;
		}
		
		public Kullanicilar(String kullaniciAdi, String email, String sifre, String rol) {
			super();
			this.kullaniciAdi = kullaniciAdi;
			this.email = email;
			this.sifre = sifre;
			this.rol = rol;
		}
		public long getKullaniciId() {
			return kullaniciId;
		}
		public void setKullaniciId(long kullaniciId) {
			this.kullaniciId = kullaniciId;
		}
		public String getKullaniciAdi() {
			return kullaniciAdi;
		}
		public void setKullaniciAdi(String kullaniciAdi) {
			this.kullaniciAdi = kullaniciAdi;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSifre() {
			return sifre;
		}
		public void setSifre(String sifre) {
			this.sifre = sifre;
		}
		public String getRol() {
			return rol;
		}
		public void setRol(String rol) {
			this.rol = rol;
		}
		@Override
		public String toString() {
			return "Kullanicilar [kullaniciId=" + kullaniciId + ", kullaniciAdi=" + kullaniciAdi + ", email=" + email
					+ ", sifre=" + sifre + ", rol=" + rol + "]";
		}
		
	    
	    
}
		