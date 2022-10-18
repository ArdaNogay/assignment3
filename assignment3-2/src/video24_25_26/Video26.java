package video24_25_26;

public class Video26 {

	public static void main(String[] args) {
		int toplamSayi= topla(1,2,3,4,5);
		System.out.println(toplamSayi);
	}

	public static int topla(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

}
