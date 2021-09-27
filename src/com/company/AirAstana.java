package com.company;

import java.util.ArrayList;
import java.util.List;

public class AirAstana implements Subject{

    private List<String> tickets = new ArrayList<>();
    private List<Observer>  observers = new ArrayList<>();


    public void addTicket(String ticket){
        this.tickets.add(ticket);
        notifyAllObserver();
    }
    public void removeTickets(String ticket){
        this.tickets.remove(ticket);
    }



    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer: observers) {
            observer.update(this.tickets);
        }
    }
}
