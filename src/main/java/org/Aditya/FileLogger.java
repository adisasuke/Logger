package org.Aditya;

public class FileLogger implements LoggerObserver{

    @Override
    public void log(String message) {
        System.out.println("Written to file : " + message);
    }
}
