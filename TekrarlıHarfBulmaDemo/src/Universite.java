
public abstract class Universite {
	protected String universiteAdi;
	
	public Universite(String universiteAdi) {
		this.universiteAdi=universiteAdi;
		
	}

	public String getUniversiteAdi() {
		return universiteAdi;
	}

	public void setUniversiteAdi(String universiteAdi) {
		this.universiteAdi = universiteAdi;
	}
	public abstract void bilgiGoruntule();
	
	

}
