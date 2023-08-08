import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class VesselSelector {

    static Messages informUser = new Messages();

    public static Object selectVessel(Fleet fleet) {
        int userInput = -1;
        int amountOfWrongInputs = 0;

        informUser.selectVessel(fleet);

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

        Object vessel = getSelectedVessel(fleet.getVesselList(), userInput);
        if (vessel != null) {
            System.out.println("You selected the Vessel with name = " + ((Vessel) vessel).getVesselName());
        } else {
            informUser.wrongInput();
        }
        return vessel;
    }

    public static Object getSelectedVessel(Set<Object> vesselList, int input) {
        boolean inputOutOfBounds = input < 0 || input > vesselList.size();
        int index = --input;
        List<Object> list = new ArrayList<>(vesselList);

        if (inputOutOfBounds) {
            return null;
        }
        return list.get(index);
    }
}
