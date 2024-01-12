
public class Personel extends Universite{
	
	protected int calisanSayisi;
	protected String personelBilgileri;
	
	public Personel(String universiteAdi,int calisanSayisi,String personelBilgileri) {
		super(universiteAdi);
		this.calisanSayisi=calisanSayisi;
		this.personelBilgileri=personelBilgileri;
	}

	
	
	public int getCalisanSayisi() {
		return calisanSayisi;
	}



	public void setCalisanSayisi(int calisanSayisi) {
		this.calisanSayisi = calisanSayisi;
	}



	public String getPersonelBilgileri() {
		return personelBilgileri;
	}



	public void setPersonelBilgileri(String personelBilgileri) {
		this.personelBilgileri = personelBilgileri;
	}



	@Override
	public void bilgiGoruntule() {
		System.out.println("Üniversite Adı: " + getUniversiteAdi());
        System.out.println("Çalışan Sayısı: " + calisanSayisi);
        System.out.println("Personel Bilgileri: " + personelBilgileri);		
	}

}
