public enum VesselType {
    FRIGATE("FRIGATE"),
    AIRCRAFT_CARRIER("AIRCRAFT CARRIER"),
    SUBMARINE("SUBMARINE"),
    CARGO_SHIP("CARGO SHIP");

    private final String NAME;

    VesselType(String name) {
        this.NAME = name;
    }

    public String getName() {
        return this.NAME;
    }
}
