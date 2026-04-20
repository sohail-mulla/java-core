package com.practice.inheritanceprograms;

public class TransportSystem {

    public static void main(String[] args) {
        Bus b = new Bus();
        Metro m = new Metro();
        Auto a = new Auto();

        b.start(); b.busInfo();
        m.start(); m.metroInfo();
        a.start(); a.autoInfo();
    }

}


class Transport {
    void start() {
        System.out.println("Transport starting");
    }
}

class Bus extends Transport {
    void busInfo() {
        System.out.println("Bus running on road");
    }
}

class Metro extends Transport {
    void metroInfo() {
        System.out.println("Metro running on track");
    }
}

class Auto extends Transport {
    void autoInfo() {
        System.out.println("Auto running locally");
    }
}
