import java.util.Scanner;
import java.util.regex.Pattern;

public class UserFleetMenu {
    Messages informUser = new Messages();
    Navigator navigate = new Navigator();

    public void show(Fleet fleet) {
        int amountOfWrongInputs = 0;
        String userInput;

        do {
            informUser.showFleetMenu();
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();
                informUser.showFleetMenu();
            }
            Scanner myObj = new Scanner(System.in);
            userInput = myObj.nextLine();
            amountOfWrongInputs++;

            // regex checks if userInput == 1, 2 or 3 .
            if (Pattern.compile("[123]").matcher(userInput).matches()) {
                amountOfWrongInputs = 0;

                switch (userInput) {
                    case "1" -> {
                        Object vessel = VesselSelector.selectVessel(fleet);
                        navigate.sailSelectedVessel(vessel);

                    }
                    case "2" -> informUser.showFleet(fleet);
                    default -> throw new IllegalStateException("Unexpected value: " + userInput);
                }
            }
        } while (!userInput.equals("3"));

    }
}
