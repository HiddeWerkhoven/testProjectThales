public class Messages {

    public void startMessage() {
        System.out.println("Hello and welcome");
    }

    public void startFleetMessage() {
        System.out.println("You can start creating your fleet now.");
    }

    public void askForHowManyTorpedos() {
        System.out.println("How many Torpedo's are there on board?");
    }

    public void askForHowManyKMToGo() {
        System.out.println("How many kilometers you want to go?");
    }

    public void askForHowManyLitersPerKM() {
        System.out.println("How many liters of fuel does the vessel use per km?");
    }

    public void askForHowManyAircraft() {
        System.out.println("How many aircraft are on board of the aircraft carrier?");
    }

    public void askForHowManyLitersAreOnBoard() {
        System.out.println("How many liters of fuel is on board?");
    }

    public void askHowDeepCanDive() {
        System.out.println("How many kilometers deep can the submarine dive? The maximum depth of the sea is 10,935 kilometers deep");
    }

    public void whichFleet(String fleetName) {
        System.out.println("You selected the Fleet with name = " + fleetName);
    }

    public void askForContainersOnBoard() {
        System.out.println("How many containers are there on board?");
    }

    public void askForVesselType() {
        System.out.println("What is the type of your Vessel?");
    }

    public void vesselTypeIndex() {
        System.out.println("1=aircraft carrier, 2=frigate, 3=cargo ship, 4=submarine");
    }

    public void askForBullets() {
        System.out.println("How many bullets are there on board?");
    }

    public void AskFleetName() {
        System.out.println("What is the name of your fleet?");
    }

    public void AskVesselName() {
        System.out.println("What is the name of your vessel?");
    }

    public void toDeep() {
        System.out.println("You want to go deeper then you are able to with this submarine");
        System.out.println("Try again");
    }

    public void createAVessel() {
        System.out.println("You are going to create a vessel for your fleet");
    }

    public void getAmountOfVesselsInFleet() {
        System.out.println("The amount of vessels in your fleet is " + Fleet.getAmountOfVessels());
    }

    public void wrongInput() {
        System.out.println("Wrong input, try again");
    }

    public void vesselCreated(Object vessel) {
        Vessel vesselObj = (Vessel) vessel;
        System.out.println("Created a " + vesselObj.getVesselType().getName().toLowerCase() + " for your fleet!");
    }

    public void showHowMuchKMCanBeSailed(double amountOfKMThatCanBeSailed) {
        System.out.println("The amount of KM that you can sail is = " + amountOfKMThatCanBeSailed + " KM");
    }

    public void showMenu(String fleetName) {
        System.out.println("-Main Menu-");
        System.out.println("You are looking at fleet '" + fleetName + "'");
        System.out.println("1=Request amount of vessels in your fleet, 2=See your fleet, 3=Create new Vessel, 4=Select Vessel from Fleet, 5=Create new Fleet, 6=Show fleet list and select fleet 7=Stop program");
    }

    public void askSailOrDive() {
        System.out.println("Do you want to sail or to dive");
        System.out.println("1= to sail, 2= to dive");
    }

    public void showFleetMenu() {
        System.out.println("-Fleet Menu-");
        System.out.println("1=Select vessel, 2=Show your fleet again, 3=Back to Main Menu");
    }

    public void ProgramStopped() {
        System.out.println("Program stopped");
    }

    public void showFleet(Fleet fleet) {
        int index = 1;
        System.out.println("here is your fleet");
        for (Object vessel : fleet.getVesselList()
        ) {
            Vessel vesselObj = (Vessel) vessel;
            System.out.println(index++ + " = " + vesselObj.getVesselName() + " is a(n) " + vesselObj.getVesselType().getName().toLowerCase());
        }

    }

    public void showFleetList() {
        int index = 1;
        System.out.println("here is a list of your fleets");
        for (Fleet fleet : Fleet.getFleetSet()
        ) {
            System.out.println(index++ + " - " + fleet.getFleetName());
        }

    }

    public void selectVessel(Fleet fleet) {
        System.out.println("which vessel do you want to select; fill in index number.");
        showFleet(fleet);
    }

    public void selectFleet() {
        System.out.println("which vessel do you want to select; fill in index number.");
        showFleetList();
    }

    public void showAmountOfFuel(Object vessel) {
        Vessel vesselObj = (Vessel) vessel;
        System.out.println("The amount of fuel you have for this vessel = " + vesselObj.getFuelAmount() + " liters");
    }

    public void showAmountOfUsageLitersPerKilometer(Object vessel) {
        Vessel vesselObj = (Vessel) vessel;
        System.out.println("The amount of liters fuel per kilometer needed = " + vesselObj.getUsageLitersPerKM() + " liters");
    }


}
