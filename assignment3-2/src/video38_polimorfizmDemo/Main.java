package src.video38_polimorfizmDemo;

public class Main {
    public static void main(String[] args) {
        BaseLogger[] baseLoggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for (BaseLogger logger: baseLoggers){
            logger.log("Log mesajı");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}
