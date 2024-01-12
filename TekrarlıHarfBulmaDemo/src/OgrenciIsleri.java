
public class OgrenciIsleri extends Universite {

	protected int ogrenciSayisi;
	protected String ogrenciBilgileri;
	protected String ogrenciTC;
	public OgrenciIsleri(String universiteAdi,int ogrenciSayisi,String ogrencibilgileri,String ogrenciTC) {
		super(universiteAdi);
		this.ogrenciSayisi=ogrenciSayisi;
		this.ogrenciBilgileri=ogrencibilgileri;
		this.ogrenciTC=ogrenciTC;}
	
	public int getOgrenciSayisi() {
		return ogrenciSayisi;
	}

	public void setOgrenciSayisi(int ogrenciSayisi) {
		this.ogrenciSayisi = ogrenciSayisi;
	}

	public String getOgrenciBilgileri() {
		return ogrenciBilgileri;
	}

	public void setOgrenciBilgileri(String ogrenciBilgileri) {
		this.ogrenciBilgileri = ogrenciBilgileri;
	}

	public String getOgrenciTC() {
		return ogrenciTC;
	}

	public void setOgrenciTC(String ogrenciTC) {
		this.ogrenciTC = ogrenciTC;
	}

	
	

	@Override
	public void bilgiGoruntule() {
		 System.out.println("Üniversite Adı: " + getUniversiteAdi());
	        System.out.println("Öğrenci Sayısı: " + ogrenciSayisi);
	        System.out.println("Öğrenci Bilgileri: " + ogrenciBilgileri);
	        System.out.println("Öğrenci TC Kimlik Numarası: " + ogrenciTC);		
	}

}
