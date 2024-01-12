package odevZip;

import java.util.ArrayList;
import java.util.Scanner;

public class OdevZip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ifade girin: ");
        String kelime = scanner.nextLine();
        scanner.close();

        // kelimeyi ziplemek için bir ArrayList oluşturduk
        ArrayList<Character> zipkelime = new ArrayList<>();

        //  tekrar edenleri atla
        for (char harf : kelime.toCharArray()) {
            if (!zipkelime.contains(harf)) { // Eğer harf daha önce eklenmemişse
                zipkelime.add(harf); // Harfi zipKelime ArrayList'ine ekleyin
            }
        }

        // Harfleri ekrana yazdırın
        System.out.print("Ziplenmiş İfade: ");
        for (char harf : zipkelime) {
            System.out.print(harf); // ZipIfade'deki her harfi ekrana yazdırın
        }
    }
}
