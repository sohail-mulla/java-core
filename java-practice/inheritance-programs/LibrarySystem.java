package com.practice.inheritanceprograms;

public class LibrarySystem {
    public static void main(String[] args) {
        Book b = new Book();
        b.openLibrary();
        b.showSection("Computer Science");
        b.issueBook("Java Basics");

    }

}

class Library {
    void openLibrary() {
        System.out.println("Library is open");
    }
}

class Section extends Library {
    void showSection(String sectionName) {
        System.out.println("Section: " + sectionName);
    }
}

class Book extends Section {
    void issueBook(String bookName) {
        System.out.println("Issuing book: " + bookName);
    }
}

