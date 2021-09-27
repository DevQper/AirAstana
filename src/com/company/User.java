package com.company;

import java.util.List;

public class User implements Observer{

    private String user;

    public User(String user){
        this.user = user;
    }

    @Override
    public void update(List<String> tickets) {
        System.out.println("Dear " + user + "\nThere are tickets available for you:)\n"+ tickets +"\n" );
    }
}
