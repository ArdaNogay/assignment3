package src.video40_abstractClasses;

public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
