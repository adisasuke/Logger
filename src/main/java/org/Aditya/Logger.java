package org.Aditya;

import java.io.Serializable;

public class Logger implements Cloneable, Serializable {

    private static volatile Logger logger;
    private static AbstractLogger abstractLogger;

    public void setLoggerlevel(int loggerlevel) {
        this.loggerlevel = loggerlevel;
    }

    private int loggerlevel;

    private Logger()
    {
        if(logger != null)
        {
            System.out.println("Logger created already please check implementation");
        }
    }


    public static Logger getLogger()
    {

        if(logger == null)
        {
            synchronized (Logger.class)
            {
                if(logger == null)
                {
                    logger = new Logger();
                    abstractLogger = LoggerManager.getLogger();
                }
            }

        }


        return logger;
    }

    public void info(String msg)
    {
        createLogger(1, msg);
    }

    public void error(String msg)
    {
        createLogger(2, msg);
    }

    public void debug(String msg)
    {
        createLogger(3, msg);
    }

    public void createLogger(int level, String msg)
    {
        abstractLogger.logMessge(level, msg, loggerlevel);
    }

}
