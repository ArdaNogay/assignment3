package video24_25_26;

public class Video24 {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	// 24
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayi mevcuttur : " + aranacak);
		} else {
			mesajVer("Sayi mevcut deðildir : " + aranacak);
		}
	}

	public static void mesajVer(String message) {
		System.out.println(message);
	}	
}
