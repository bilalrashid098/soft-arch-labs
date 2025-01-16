package org.example.creational.factory;

public class DocumentFactory {

    public static Document createDocument(String type) {
        switch (type) {
            case "PPT":
                return new PPTDocument();
            case "PDF":
                return new PDFDocument();
            case "Word":
                return new WordDocument();
            case "HTML":
                return new HTMLDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
