public class StartProgram {

    public static void run() {
        Messages informUser = new Messages();
        informUser.startMessage();
        FleetInitializer.initializeFleet();
    }


}
