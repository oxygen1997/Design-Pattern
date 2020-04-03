package com.zy.subject;

import com.zy.observer.abstrac.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    private List<Observer> observers = new ArrayList<>();

    //添加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //通知所有观察者更新状态
    public void notifyAllObserver(){
        for (Observer observer:observers) {
            observer.update();
        }
    }

}
