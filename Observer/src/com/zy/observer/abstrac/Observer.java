package com.zy.observer.abstrac;

import com.zy.subject.Subject;

public abstract class Observer {
    public abstract void update();
    protected Subject subject;
}
