import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FleetSelector {
    static Messages informUser = new Messages();

    public static Fleet selectFleet() {
        int userInput = -1;
        int amountOfWrongInputs = 0;

        informUser.selectFleet();

        do {
            Scanner myObj = new Scanner(System.in);
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();
            }
            try {
                userInput = myObj.nextInt();
            } catch (Exception ignored) {
            }
            amountOfWrongInputs++;
        }
        while (userInput < 0);

        Fleet fleet = getSelectedFleet(Fleet.getFleetSet(), userInput);
        if (fleet != null) {
            informUser.whichFleet(fleet.getFleetName());
        } else {
            informUser.wrongInput();
        }
        return fleet;
    }

    public static Fleet getSelectedFleet(Set<Fleet> fleetSet, int input) {
        boolean inputOutOfBounds = input < 0 || input > fleetSet.size();
        int index = --input;
        List<Fleet> list = new ArrayList<>(fleetSet);

        if (inputOutOfBounds) {
            return null;
        }
        return list.get(index);
    }
}
