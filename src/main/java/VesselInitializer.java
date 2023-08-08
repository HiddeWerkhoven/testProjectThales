
import java.util.Objects;

public class VesselInitializer {

    static int vesselID = 0;
    static Messages informUser = new Messages();


    public static void initializeVessel(Fleet fleet) {
        Object vessel = initializeVesselType(Objects.requireNonNull(InputScanner.askUserForVesselType()), fleet);
        fleet.addVessel(vessel);
        informUser.vesselCreated(vessel);
    }

    private static Object initializeVesselType(VesselType vesselType, Fleet fleet) {
        if (vesselType.equals(VesselType.AIRCRAFT_CARRIER)) {
            AircraftCarrier aircraftCarrier = new AircraftCarrier(vesselID++, InputScanner.askUserForVesselName(), vesselType, InputScanner.askUserForFuelAmountOnBoard(), InputScanner.askUserForUsageLitersPerKilometer(), fleet);
            aircraftCarrier.setAmountOfAircraft(InputScanner.askUserForAmountOfAircraft());
            return aircraftCarrier;
        }

        if (vesselType.equals(VesselType.FRIGATE)) {
            Frigate frigate = new Frigate(vesselID++, InputScanner.askUserForVesselName(), vesselType, InputScanner.askUserForFuelAmountOnBoard(), InputScanner.askUserForUsageLitersPerKilometer(), fleet);
            frigate.setAmountOfBullets(InputScanner.askUserForAmountOfBullets());
            return frigate;
        }

        if (vesselType.equals(VesselType.SUBMARINE)) {
            Submarine submarine = new Submarine(vesselID++, InputScanner.askUserForVesselName(), vesselType, InputScanner.askUserForFuelAmountOnBoard(), InputScanner.askUserForUsageLitersPerKilometer(), fleet);
            submarine.setAmountOfTorpedos(InputScanner.askUserForAmountOfTorpedos());
            submarine.setMaximumDivingDepth(InputScanner.askUserForMaximumDivingDepth());
            return submarine;
        }

        if (vesselType.equals(VesselType.CARGO_SHIP)) {
            CargoShip cargoShip = new CargoShip(vesselID++, InputScanner.askUserForVesselName(), vesselType, InputScanner.askUserForFuelAmountOnBoard(), InputScanner.askUserForUsageLitersPerKilometer(), fleet);
            cargoShip.setAmountOfCargoContainers(InputScanner.askUserForAmountOfCargoContainers());
            return cargoShip;
        }
        return null;
    }


}
