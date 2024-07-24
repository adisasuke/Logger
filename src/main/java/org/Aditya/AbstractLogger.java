package org.Aditya;

public abstract class AbstractLogger {

    protected int level;
    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessge(int level, String message, int loggerLevel, LoggerSubject loggerSubject)
    {
        if(level == this.level && loggerLevel>=this.level)
        {
            display(message, loggerSubject);
        }

        if(nextLogger != null)
        {
            nextLogger.logMessge(level, message, loggerLevel, loggerSubject);
        }

    }


    protected abstract void display(String msg, LoggerSubject loggerSubject);
}
