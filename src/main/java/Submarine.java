public class Submarine extends Vessel {

    private double maximumDivingDepth;

    private int AmountOfTorpedos;

    public Submarine(int vesselID, String vesselName, VesselType vesselType, double fuelAmount, double usageLitersPerKilometer, Fleet fleet) {
        super(vesselID, vesselName, vesselType, fuelAmount, usageLitersPerKilometer, fleet);
    }

    public double getMaximumDivingDepth() {
        return maximumDivingDepth;
    }

    public void setMaximumDivingDepth(double maximumDivingDepth) {
        this.maximumDivingDepth = maximumDivingDepth;
    }

    public int getAmountOfTorpedos() {
        return AmountOfTorpedos;
    }

    public void setAmountOfTorpedos(int amountOfTorpedos) {
        AmountOfTorpedos = amountOfTorpedos;
    }
}
