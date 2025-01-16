package org.example.creational.factory;

public class HTMLDocument implements Document {
    @Override
    public void open() {
        System.out.println("Open HTML Document");
    }
}
