package com.company;

public class Main {
    public static void main(String[] args) {
        AirAstana fly = new AirAstana();
        fly.addTicket("Astana - Almaty 14:00");
        fly.addTicket("Astana - Almaty 16:00");
        fly.addTicket("Petropavlovsk - Astana 17:00");
        fly.addTicket("Petropavlovsk - Shimkent 17:00");

        User asset = new User("Asset");
        User Shina = new User("Shina");


        fly.registerObserver(asset);
        fly.registerObserver(Shina);

        User Test = new User("Test");
        fly.registerObserver(Test);
        fly.unregisterObserver(Test);

        fly.removeTickets("Petropavlovsk - Shimkent 17:00");
        fly.notifyAllObserver();

    }
}
