package okuma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class okuma {
    public static void main(String[] args) {
        try {
            String dosyaYolu = "C:\\Users\\omer\\Desktop\\dosya.txt";
            List<String> satirlar = new ArrayList<>();
            //burada bufferedReader kullandım
            try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
                String satir;
                while ((satir = br.readLine()) != null) {
                    satirlar.add(satir);
                }
            }

            // ArrayList'te bulunan satırları ekrana yazdırma
            for (String satir : satirlar) {
                System.out.println(satir);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
