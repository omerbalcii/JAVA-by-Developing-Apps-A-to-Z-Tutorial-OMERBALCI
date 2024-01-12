package odevMap;


import java.util.HashMap;
import java.util.Scanner;


public class odevMap {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için bir Scanner 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: "); 
        String metin = scanner.nextLine(); // metni oku
        scanner.close(); 

        // Harf sayılarını saklamak için bir HashMap oluşturduk
        HashMap<Character, Integer> harfSayilari = new HashMap<>();

        // Metin üzerinde dolaşarak harf sayıları
        for (char harf : metin.toCharArray()) {
            if (Character.isLetter(harf)) { // Sadece harf karakterleri
                harf = Character.toLowerCase(harf); // Harf büyük/küçük farkını yok saymak için küçük harfe dönüştürüyoruz
                // HarfSayilari HashMap'ine ekleyin veya varsa sayısını arttır
                harfSayilari.put(harf, harfSayilari.getOrDefault(harf, 0) + 1);
            }
        }

        // Sonuçları ekrana yazdır
        for (char harf : harfSayilari.keySet()) {
            int sayi = harfSayilari.get(harf);
            System.out.print(harf + "" + sayi); // Her harfi ve sayısını yazdır
        }
    }
}
