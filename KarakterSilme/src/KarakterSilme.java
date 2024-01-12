
public class KarakterSilme {
    public static void main(String[] args) {
    	 //  Giriş metni ve silinecek harf tekrar sayısı 
    	String Metin = "omer   faruk balciiioooo";
        int tekrarSayisi = 2;

        String sonuc = karakterleriSil(Metin, tekrarSayisi);

        System.out.println("Orjinal Metin: " + Metin);
        System.out.println("yeni Metin: " + sonuc);
    }
    //  karakterleriSil, verilen metinde tekrar sayısına göre karakterleri siler.

    public static String karakterleriSil(String metin, int tekrarSayisi) {
        StringBuilder sonuc = new StringBuilder();
      //  Metindeki her karakter için bir döngü başlatılır.
        for (int i = 0; i < metin.length(); i++) {
            //  Metindeki i. karakter alınır.

            char harf = metin.charAt(i);
       // tekrarSayisi fonksiyonu kullanılarak bu karakterin metinde kaç kez tekrarlandığı hesaplanır.

            if (tekrarSayisi(metin, harf) < tekrarSayisi) {
         // Eğer karakter belirli bir sayıdan daha az tekrarlanıyorsa, sonuca eklenir.
            //append=eklemeye yarar.
            	sonuc.append(harf);
            }
        }
        return sonuc.toString();
    }
 // Bir karakterin metin içinde kaç kez tekrarlandığını sayan fonksiyon.

    public static int tekrarSayisi(String metin, char harf) {
        int sayac = 0;
        for (int i = 0; i < metin.length(); i++) {
//  Eğer metindeki i. karakter, verilen harfe eşitse, sayac artırılır.

            if (metin.charAt(i) == harf) {
                sayac++;
            }
        }
        return sayac;
    }
}

