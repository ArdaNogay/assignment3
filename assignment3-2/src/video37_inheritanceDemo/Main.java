package src.video37_inheritanceDemo;

public class Main {

    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new TarımKrediManager());
    }

}
