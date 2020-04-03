package com.zy.observer;

import com.zy.observer.abstrac.Observer;
import com.zy.subject.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "八进制：Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
