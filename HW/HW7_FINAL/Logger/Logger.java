package HW.HW7_FINAL.Logger;

public class Logger implements ILogger{

    public Logger(){
    }
    @Override
    public void loggerMessage(String message) {
        System.out.println("LOGGER: " + message);
    }
}
