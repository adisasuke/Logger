package org.Aditya;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level)
    {
        this.level = level;
    }

    @Override
    protected void display(String msg) {
        System.out.println("Debug : " + msg);
    }
}
