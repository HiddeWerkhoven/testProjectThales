import java.util.Scanner;
import java.util.regex.Pattern;

public class InputScanner {

    static Messages informUser = new Messages();


    public static boolean wantToDive() {
        int amountOfWrongInputs = 0;
        String userInput;

        informUser.askSailOrDive();

        do {
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();
            }
            Scanner myObj = new Scanner(System.in);
            userInput = myObj.nextLine();
            amountOfWrongInputs++;
        }
        // regex checks if userInput == 1, 2
        while (!Pattern.compile("[12]").matcher(userInput).matches());
        return userInput.equals("2");
    }


    public static VesselType askUserForVesselType() {
        int amountOfWrongInputs = 0;

        String userInput;

        informUser.askForVesselType();
        informUser.vesselTypeIndex();

        do {
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();
                informUser.vesselTypeIndex();
            }
            Scanner myObj = new Scanner(System.in);
            userInput = myObj.nextLine();
            amountOfWrongInputs++;
        }
        // regex checks if userInput == 1, 2, 3 or 4.
        while (!Pattern.compile("[1234]").matcher(userInput).matches());

        switch (userInput) {
            case "1" -> {
                return VesselType.AIRCRAFT_CARRIER;
            }
            case "2" -> {
                return VesselType.FRIGATE;
            }
            case "3" -> {
                return VesselType.CARGO_SHIP;
            }
            case "4" -> {
                return VesselType.SUBMARINE;
            }

        }
        return null;
    }

    public static int askUserForAmountOfCargoContainers() {
        int userInput = -1;
        int amountOfWrongInputs = 0;

        informUser.askForContainersOnBoard();
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

        return userInput;
    }

    public static double askUserForMaximumDivingDepth() {
        Double userInput = null;
        final double MAXIMUM_DEPTH_OF_SEA = 10.935;
        int amountOfWrongInputs = 0;

        informUser.askHowDeepCanDive();
        do {
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();

            }
            Scanner myObj = new Scanner(System.in);
            try {
                userInput = myObj.nextDouble();
            } catch (Exception ignored) {
            }
            amountOfWrongInputs++;
        } while (userInput == null || userInput > MAXIMUM_DEPTH_OF_SEA);

        return userInput;

    }

    public static String askUserForVesselName() {
        String userInput;
        int amountOfWrongInputs = 0;

        informUser.AskVesselName();

        do {
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();
            }
            Scanner myObj = new Scanner(System.in);
            userInput = myObj.nextLine();
            amountOfWrongInputs++;
        }
        while (userInput.isEmpty());

        return userInput;
    }

    public static String askUserForFleetName() {
        String userInput;
        int amountOfWrongInputs = 0;

        informUser.AskFleetName();
        do {
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();
            }
            Scanner myObj = new Scanner(System.in);
            userInput = myObj.nextLine();
            amountOfWrongInputs++;
        }
        while (userInput.isEmpty());

        return userInput;
    }

    public static int askUserForAmountOfBullets() {
        int userInput = -1;
        int amountOfWrongInputs = 0;

        informUser.askForBullets();
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

        return userInput;
    }

    public static int askUserForAmountOfTorpedos() {
        int userInput = -1;
        int amountOfWrongInputs = 0;

        informUser.askForHowManyTorpedos();
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

        return userInput;
    }


    public static int askUserForAmountOfAircraft() {
        int userInput = -1;
        int amountOfWrongInputs = 0;

        informUser.askForHowManyAircraft();

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

        return userInput;
    }


    public static double askUserForFuelAmountOnBoard() {
        Double userInput = null;
        int amountOfWrongInputs = 0;

        informUser.askForHowManyLitersAreOnBoard();

        do {
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();
            }
            Scanner myObj = new Scanner(System.in);
            try {
                userInput = myObj.nextDouble();
            } catch (Exception ignored) {
            }
            amountOfWrongInputs++;
        } while (userInput == null);

        return userInput;

    }

    public static double askUserForUsageLitersPerKilometer() {
        Double userInput = null;
        int amountOfWrongInputs = 0;

        informUser.askForHowManyLitersPerKM();
        do {
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();
            }
            Scanner myObj = new Scanner(System.in);
            try {
                userInput = myObj.nextDouble();
            } catch (Exception ignored) {
            }
            amountOfWrongInputs++;
        } while (userInput == null);

        return userInput;
    }

    public static double askUserForKilometerToGo() {
        double userInput = -1;
        int amountOfWrongInputs = 0;

        informUser.askForHowManyKMToGo();
        do {
            Scanner myObj = new Scanner(System.in);
            if (amountOfWrongInputs > 0) {
                informUser.wrongInput();
            }
            try {
                userInput = myObj.nextDouble();
            } catch (Exception ignored) {
            }


            amountOfWrongInputs++;
        }
        while (userInput < 0);

        return userInput;
    }
}
