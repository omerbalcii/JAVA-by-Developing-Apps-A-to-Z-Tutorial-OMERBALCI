
public class MatrisOdev {

	 public static void main(String[] args) {
	        int[][] matris = {
	            {10, 20, 30},
	            {40, 50, 60},
	            {70, 80, 90}
	        };

	        
	        matrisiYazdir(matris);

	        System.out.println("\n");
	        matrisiTersYazdir(matris);
	    }

	    public static void matrisiTersYazdir(int[][] matris) {
	        int satirSayisi = matris.length;
	        int sutunSayisi = matris[0].length;

	        for (int i = satirSayisi - 1; i >= 0; i--) {
	            for (int j = sutunSayisi - 1; j >= 0; j--) {
	                System.out.print(matris[i][j] + " ");
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
