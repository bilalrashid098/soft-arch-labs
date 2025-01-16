package org.example.creational.factory;

public class PPTDocument implements Document {
    @Override
    public void open() {
        System.out.println("Open PPT document");
    }
}
