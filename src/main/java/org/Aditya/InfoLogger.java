package org.Aditya;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level)
    {
        this.level = level;
    }

    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {
        String message = "Info : " + msg;
        loggerSubject.log(1, message);
    }
}
