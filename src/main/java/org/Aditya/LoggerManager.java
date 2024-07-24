package org.Aditya;

public class LoggerManager {



    public static AbstractLogger getLogger()
    {
        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger errorLogger = new ErrorLogger(2);
        AbstractLogger debugLogger = new DebugLogger(3);

        infoLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(debugLogger);

        return infoLogger;
    }

    public static LoggerSubject getLoggerSubject()
    {
        LoggerObserver fileObserver = new FileLogger();
        LoggerObserver consoleObserver = new ConsoleLogger();
        LoggerSubject subject = new LoggerSubject();
        subject.addObserver(1,fileObserver);
        subject.addObserver(1,consoleObserver);
        subject.addObserver(2,consoleObserver);
        subject.addObserver(3,consoleObserver);
        return subject;
    }


}
