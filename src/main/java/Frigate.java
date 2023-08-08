

public class Frigate extends Vessel {

    private int amountOfBullets;

    public Frigate(int vesselID, String vesselName, VesselType vesselType, double fuelAmount, double usageLitersPerKilometer, Fleet fleet) {
        super(vesselID, vesselName, vesselType, fuelAmount, usageLitersPerKilometer, fleet);
    }

    public int getAmountOfBullets() {
        return amountOfBullets;
    }

    public void setAmountOfBullets(int amountOfBullets) {
        this.amountOfBullets = amountOfBullets;
    }
}
