package oop.lab10.singleton.example;

public class Printer {
    private static Printer instance;

    private Printer() {
    }

    public static synchronized Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}
