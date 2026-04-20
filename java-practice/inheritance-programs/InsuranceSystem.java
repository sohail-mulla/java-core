package com.practice.inheritanceprograms;

public class InsuranceSystem {


    public static void main(String[] args) {
        FamilyHealthPlan f = new FamilyHealthPlan();
        f.policy();
        f.healthCover();
        f.familyCover();
    }
}
class Insurance {
    void policy() {
        System.out.println("Basic insurance policy");
    }
}

class HealthInsurance extends Insurance {
    void healthCover() {
        System.out.println("Health insurance coverage");
    }
}

class FamilyHealthPlan extends HealthInsurance {
    void familyCover() {
        System.out.println("Family health plan activated");
    }
}
