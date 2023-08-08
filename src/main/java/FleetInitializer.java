public class FleetInitializer {

    private static int fleetID = 0;

    public static void initializeFleet() {
        Messages informUser = new Messages();
        UserMainMenu userMainMenu = new UserMainMenu();

        informUser.startFleetMessage();

        Fleet fleet = new Fleet(InputScanner.askUserForFleetName(), fleetID++);

        informUser.createAVessel();

        VesselInitializer.initializeVessel(fleet);
        Fleet.getFleetSet().add(fleet);

        userMainMenu.show(fleet);

    }
}
