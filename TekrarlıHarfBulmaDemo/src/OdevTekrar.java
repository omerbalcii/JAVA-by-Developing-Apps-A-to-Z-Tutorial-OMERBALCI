
//UniversiteUygulamasi.java
public class OdevTekrar {
 public static void main(String[] args) {
     // Düzce Üniversitesi nesnesi oluşturuluyor ve kuruluş bilgileri atanıyor
     Universite universite = new Universite("Düzce Üniversitesi") {
         // Universite sınıfının soyut metodu olan bilgiGoruntule'yi uygulama
         @Override
         public void bilgiGoruntule() {
             System.out.println("Üniversite Adı: " + getUniversiteAdi());
         }
     };

     // Öğrenci İşleri nesnesi oluşturuluyor ve öğrenci bilgileri atanıyor
     OgrenciIsleri ogrenciIsleri = new OgrenciIsleri("Düzce Üniversitesi", 10000, "Öğrenci İşleri Bilgileri", "12345678900");

     // Personel nesnesi oluşturuluyor ve personel bilgileri atanıyor
     Personel personel = new Personel("Düzce Üniversitesi", 2000, "Personel Bilgileri");

     // Düzce Üniversitesi Bilgileri
     System.out.println("Düzce Üniversitesi Bilgileri:");
     universite.bilgiGoruntule();
     System.out.println();

     // Öğrenci İşleri Bilgileri
     System.out.println("Öğrenci İşleri Bilgileri:");
     ogrenciIsleri.bilgiGoruntule();
     System.out.println();

     // Personel Bilgileri
     System.out.println("Personel Bilgileri:");
     personel.bilgiGoruntule();
     System.out.println();

     // Bilgileri güncelleme örnekleri
     universite.setUniversiteAdi(" Düzce Teknik Üniversitesi ");
     ogrenciIsleri.setOgrenciSayisi(12000);
     ogrenciIsleri.setOgrenciBilgileri("Yeni Öğrenci Bilgileri");
      ogrenciIsleri.setOgrenciTC("Yeni TC Kimlik Numarası"); // TC Kimlik Numarası ayarlanamaz
     personel.setCalisanSayisi(2500);
     personel.setPersonelBilgileri("Yeni Personel Bilgileri");

     // Güncellenmiş bilgileri görüntüleme
     System.out.println("\nGüncellenmiş Bilgiler:");
     universite.bilgiGoruntule();
     System.out.println();
     ogrenciIsleri.bilgiGoruntule();
     System.out.println();
     personel.bilgiGoruntule();
 }
}
