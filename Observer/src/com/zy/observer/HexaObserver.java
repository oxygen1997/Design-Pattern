package com.zy.observer;

import com.zy.observer.abstrac.Observer;
import com.zy.subject.Subject;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "十六进制：Hexa String: " + Integer.toHexString( subject.getState() ) );
    }
}
