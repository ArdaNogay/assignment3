package video24_25_26;

public class Video25 {

	public static void main(String[] args) {
		String message = "Hava guzel";
		String newMessage = sehirVer();
		int sayi = topla(8, 9);
		System.out.println(sayi);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Guncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}
