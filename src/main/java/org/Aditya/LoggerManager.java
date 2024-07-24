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
}
