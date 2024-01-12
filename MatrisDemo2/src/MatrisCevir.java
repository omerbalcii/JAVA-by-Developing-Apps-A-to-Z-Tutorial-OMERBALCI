
public class MatrisCevir {
    public static void main(String[] args) {
        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

       
        matrisiYazdir(matris);

        System.out.println("\nÇevrilmiş hali:");
        cevrilmisMatrisiYazdir(matris);
    }

    public static void cevrilmisMatrisiYazdir(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = satirSayisi - 1; j >= 0; j--) {
                System.out.print(matris[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void matrisiYazdir(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
