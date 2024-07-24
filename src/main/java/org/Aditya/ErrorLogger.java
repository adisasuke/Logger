package org.Aditya;

public class ErrorLogger extends  AbstractLogger{

    public ErrorLogger(int level)
    {
        this.level = level;
    }



    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {
        String message = "Error : " + msg;
        loggerSubject.log(2, message);
    }
}
