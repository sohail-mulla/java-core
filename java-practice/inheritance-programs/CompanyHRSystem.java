package com.practice.inheritanceprograms;

public class CompanyHRSystem {

    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.manage();
    }

}
class Company {
    void work() {
        System.out.println("Company operations running");
    }
}

class Manager extends Company {
    void manage() {
        System.out.println("Manager is managing team");
    }
}
