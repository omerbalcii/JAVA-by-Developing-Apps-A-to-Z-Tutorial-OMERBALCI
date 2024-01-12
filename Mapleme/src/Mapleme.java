

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Mapleme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: "); //numan karaaslan
        String metin = scanner.nextLine(); // metni oku
        scanner.close(); 

        // LinkedHashMap 
        LinkedHashMap<Character, Integer> harfSayilari = new LinkedHashMap<>();

        for (char harf : metin.toCharArray()) {
            if (Character.isLetter(harf)) { 
                harf = Character.toLowerCase(harf); 
                
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
