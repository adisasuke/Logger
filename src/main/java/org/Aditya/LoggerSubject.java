package org.Aditya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoggerSubject {
    private Map<Integer, List<LoggerObserver>> mp;

    public LoggerSubject()
    {
        mp = new HashMap<Integer, List<LoggerObserver>>();
    }


    public void addObserver(int level, LoggerObserver observer)
    {
        List<LoggerObserver> list = mp.getOrDefault(level, new ArrayList<>());
        list.add(observer);
        mp.put(level, list);
    }

    public void log(int level, String msg)
    {
        List<LoggerObserver> list = mp.get(level);
        if(list == null)
        {
            return;
        }
        for(LoggerObserver obs : list)
        {
            obs.log(msg);
        }
    }

}
