package src.video38_polimorfizmDemo;

public class DatabaseLogger extends BaseLogger{
    public void log(String message) {
        System.out.println("Logged to database : " + message);
    }
}
