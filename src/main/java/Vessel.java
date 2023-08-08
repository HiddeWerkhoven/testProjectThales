public class Vessel extends Fleet {

    private static int fleetID = 0;
    private final int VESSEL_ID;
    private final double USAGE_LITERS_PER_KILOMETER;
    private double fuelAmount;
    private final VesselType VESSEL_TYPE;
    private final String VESSEL_NAME;


    public Vessel(int vesselID, String vesselName, VesselType vesselType, double fuelAmount, double usageLitersPerKilometer, Fleet fleet) {
        super(fleet.getFleetName(), fleetID++);
        this.VESSEL_ID = vesselID;
        this.VESSEL_NAME = vesselName;
        this.VESSEL_TYPE = vesselType;
        this.fuelAmount = fuelAmount;
        this.USAGE_LITERS_PER_KILOMETER = usageLitersPerKilometer;

    }

    public String getVesselName() {
        return VESSEL_NAME;
    }

    public VesselType getVesselType() {
        return VESSEL_TYPE;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getUsageLitersPerKM() {
        return USAGE_LITERS_PER_KILOMETER;
    }

    public int getVesselID() {
        return VESSEL_ID;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }


}
