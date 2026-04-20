package com.practice.inheritanceprograms;


public class UniversityManagement {
    public static void main(String[] args) {
        Student s = new Student();
        Professor p = new Professor();
        Staff st = new Staff();

        s.display();
        s.study();
        p.display();
        p.teach();
        st.display();
        st.work();
    }
}

class University {
    String name = "ABC University";

    void display() {
        System.out.println("University: " + name);
    }
}

class Student extends University {
    void study() {
        System.out.println("Student is studying");
    }
}

class Professor extends University {
    void teach() {
        System.out.println("Professor is teaching");
    }
}

class Staff extends University {
    void work() {
        System.out.println("Staff is working");
    }
}
