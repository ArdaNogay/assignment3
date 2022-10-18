package src.video40_abstractClasses;

public class Main {
    public static void main(String[] args) {
        GameCalculator gameCalculators = new WomanGameCalculator();
        gameCalculators.hesapla();
        gameCalculators.gameOver();

    }
}
