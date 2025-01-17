package org.example.structural.dto;

import lombok.Data;

@Data
public class BookDto {
    private String title;
    private String author;
    private double price;
    private boolean isFeature;

    public void setIsFeature(boolean feature) {
        isFeature = feature;
    }

    public boolean getIsFeature() {
        return isFeature;
    }
}
