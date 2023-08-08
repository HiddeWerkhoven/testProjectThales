public class CargoShip extends Vessel {

    private int amountOfCargoContainers;

    public CargoShip(int vesselID, String vesselName, VesselType vesselType, double fuelAmount, double usageLitersPerKilometer, Fleet fleet) {
        super(vesselID, vesselName, vesselType, fuelAmount, usageLitersPerKilometer, fleet);
    }

    public int getAmountOfCargoContainers() {
        return amountOfCargoContainers;
    }

    public void setAmountOfCargoContainers(int amountOfCargoContainers) {
        this.amountOfCargoContainers = amountOfCargoContainers;
    }
}

