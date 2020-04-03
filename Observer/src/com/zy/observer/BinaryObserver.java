package com.zy.observer;

import com.zy.observer.abstrac.Observer;
import com.zy.subject.Subject;

public  class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "二进制：Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
