package org.example.creational.builder;

// TODO implement logic
public class Car {
    private String engine;
    private String transmission;
    private String interior;
    private String color;
    private boolean hasSunroof;
    private boolean airBags;

    // Private constructor to be called by the Builder
    private Car(Builder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.interior = builder.interior;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
        this.airBags = builder.airBags;
    }

    @Override
    public String toString() {
        return "Engine = '" + engine + '\'' +
                ", Transmission = '" + transmission + '\'' +
                ", Interior Type = '" + interior + '\'' +
                ", Color = '" + color + '\'' +
                ", Sunroof = " + hasSunroof +
                ", Air Bag = " + airBags;
    }

    public static class Builder {
        private String engine;
        private String transmission;
        private String interior;
        private String color;
        private boolean hasSunroof;
        private boolean airBags;

        // Setter methods for each attribute, returning the Builder itself for chaining
        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder setInteriorType(String interior) {
            this.interior = interior;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Builder setAirBags(boolean airBags) {
            this.airBags = airBags;
            return this;
        }

        // Final build method to create a Car instance
        public Car build() {
            return new Car(this);
        }
    }
}
