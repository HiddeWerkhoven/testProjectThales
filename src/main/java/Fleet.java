import java.util.*;

public class Fleet {

    private static int amountOfVessels;
    private final int FLEET_ID;
    private static final Set<Fleet> fleetSet = new HashSet<>();
    private final Set<Object> vesselSet = new HashSet<>();
    private final String FLEET_NAME;

    public Fleet(String FLEET_NAME, int FLEET_ID) {
        this.FLEET_NAME = FLEET_NAME;
        this.FLEET_ID = FLEET_ID;
    }

    public void addVessel(Object vessel) {
        amountOfVessels = amountOfVessels + 1;
        vesselSet.add(vessel);
    }

    public static int getAmountOfVessels() {
        return amountOfVessels;
    }

    public static Set<Fleet> getFleetSet() {
        return fleetSet;
    }

    public Set<Object> getVesselList() {
        return vesselSet;
    }

    public String getFleetName() {
        return FLEET_NAME;
    }


}
