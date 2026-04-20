package com.practice.inheritanceprograms;

public class ClassHotel {
    public static void main(String[] args) {
        LuxuryHotel h = new LuxuryHotel();
        h.bookRoom();
        h.premiumService();
    }
}
class Hotel {
    void bookRoom() {
        System.out.println("Room booked in standard hotel");
    }
}

class LuxuryHotel extends Hotel {
    void premiumService() {
        System.out.println("Providing luxury services");
    }
}
