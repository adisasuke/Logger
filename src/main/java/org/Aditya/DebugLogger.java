package org.Aditya;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level)
    {
        this.level = level;
    }

    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {
        String message = "Debug : " + msg;
        loggerSubject.log(3, message);
    }
}
