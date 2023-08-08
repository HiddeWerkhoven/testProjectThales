
public class AircraftCarrier extends Vessel {

    private int amountOfAircraft;

    public AircraftCarrier(int vesselID, String vesselName, VesselType vesselType, double fuelAmount, double usageLitersPerKilometer, Fleet fleet) {
        super(vesselID, vesselName, vesselType, fuelAmount, usageLitersPerKilometer, fleet);

    }

    public int getAmountOfAircraft() {
        return amountOfAircraft;
    }

    public void setAmountOfAircraft(int amountOfAircraft) {
        this.amountOfAircraft = amountOfAircraft;
    }
}
