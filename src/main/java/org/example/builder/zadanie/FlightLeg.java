package org.example.builder.zadanie;

public class FlightLeg {
    private String from;
    private String to;
    private boolean delayed;
    private double price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private boolean delayed;
        private double price;

        public FlightLegBuilder(String from, String to) {
            FlightLegBuilder(from,to);
        }

        public FlightLegBuilder FlightLegBuilder (String from, String to) {
            this.from = from;
            this.to = to;
            return this;
        }

        public FlightLegBuilder price(double price) {
            this.price = price;
            return this;
        }
        public FlightLeg build() {
            if(price == 0.0) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }
            return new FlightLeg(this);
        }

    }
}
