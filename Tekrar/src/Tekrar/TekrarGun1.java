package Tekrar;

import java.util.Iterator;

public class TekrarGun1 {

	public static void main(String[] args) {
		//ornek1();
		//ornek2();
		//ornek4();
		ornek5();
		

	}
	
	private static void ornek5()
	{
		Integer[] sayilar =
		{ 1, 2, 3 };
//		for (int i = 0; i < sayilar.length; i++)
//		{
//			Integer sayi = sayilar[i];
//		}
		for (Integer sayi : sayilar)
		{
			System.err.println(sayi);
		}
	}
	private static void ornek4()
	{
//		for (int i = 0, j = 0; i < 10; i++, j++)
//		{
//		}
//		for (int i = 0; i < 10; i++)
//		{
//			if (i == 5)
//			{
//				break;
////				continue;
//			}
//			System.err.println(i);
//		}
		int i = 0;
		while (i < 10)
		{
			if (i == 5 || i == 8)
			{
				i++;
				continue;
			}
			System.err.println(i);
			i++;
		}
	}
	private static void ornek2()
	{
		// 3 e 4 lük dizi [3][4]
		// 1, 2, 3, 4
		// 5, 6, 7, 8
		// 9, 10, 11, 12
//		Integer[][] sayilar = new Integer[][]
//		{ new Integer[]
//				{ 1, 2, 3 }, new Integer[]
//				{ 1, 2, 3, 4 } };
		// ----------------
		Integer[][] sayilar = new Integer[3][3];
		sayilar[0] = new Integer[]
		{ 12, 23, 34, 45 };
		sayilar[1] = new Integer[]
		{ 6, 7, 8 };
		// ----------------
//		int[][] sayilar =
//		{
//				{ 1, 3, 5, 7 },
//				{ 9, 11, 13 } };
		for (int i = 0; i < sayilar.length; i++)
		{
			for (int j = 0; j < sayilar[i].length; j++)
			{
				System.err.print(sayilar[i][j] + " ");
			}
			System.err.println();
		}
	}

	private static void ornek1() {
		
		Integer[]sayilar= {1,2,3,4};
		Integer[]sayilar2=new Integer[6];
		sayilar2[0]=5;
		sayilar2[3]=25;
		
		for (int i = 0; i < sayilar2.length; i++) {
			System.err.println(sayilar2[i] );
			
		}
	}

}
