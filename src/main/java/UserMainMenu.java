import java.util.Scanner;
import java.util.regex.Pattern;

public class UserMainMenu {

    Messages informUser = new Messages();
    UserFleetMenu userFleetMenu = new UserFleetMenu();
    Navigator navigate = new Navigator();

    public void show(Fleet fleet) {
        int amountOfWrongInputs = 0;
        String userInput;

        do {
            informUser.showMenu(fleet.getFleetName());
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();
                informUser.showMenu(fleet.getFleetName());
            }
            Scanner myObj = new Scanner(System.in);
            userInput = myObj.nextLine();
            amountOfWrongInputs++;

            // regex checks if userInput == 1 till 7.
            if (Pattern.compile("[1234567]").matcher(userInput).matches()) {
                amountOfWrongInputs = 0;

                switch (userInput) {
                    case "1" -> {
                        informUser.getAmountOfVesselsInFleet();
                    }
                    case "2" -> {
                        informUser.showFleet(fleet);
                        userFleetMenu.show(fleet);
                    }
                    case "3" -> {
                        VesselInitializer.initializeVessel(fleet);
                    }
                    case "4" -> {
                        Object vessel = VesselSelector.selectVessel(fleet);
                        navigate.sailSelectedVessel(vessel);
                    }
                    case "5" -> {
                        FleetInitializer.initializeFleet();
                    }
                    case "6" -> {
                        fleet = FleetSelector.selectFleet();
                    }
                    case "7" -> {
                        informUser.ProgramStopped();
                    }
                }
            }
        } while (!userInput.equals("7"));
    }
}

