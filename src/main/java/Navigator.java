public class Navigator {

    Messages informUser = new Messages();

    public void sailSelectedVessel(Object vessel) {
        Vessel vesselObj = (Vessel) vessel;
        boolean wantToDive = false;
        double amountOfFuel = vesselObj.getFuelAmount();
        double amountOfUsageLitersPerKm = vesselObj.getUsageLitersPerKM();
        double amountOfKMThatCanBeSailed = calculateAmountOfKMThatCanBeSailed(amountOfFuel, amountOfUsageLitersPerKm, wantToDive);
        double requestedAmountOfKMToSail;
        boolean hasSailed = false;
        boolean toDeep = false;


        showNavigationInfo(vessel, amountOfKMThatCanBeSailed);


        do {
            requestedAmountOfKMToSail = InputScanner.askUserForKilometerToGo();

            if (vesselObj.getVesselType().equals(VesselType.SUBMARINE)) {
                wantToDive = InputScanner.wantToDive();
                if (wantToDive) {
                    Submarine submarine = (Submarine) vessel;
                    if (requestedAmountOfKMToSail > submarine.getMaximumDivingDepth()) {
                        amountOfKMThatCanBeSailed = 0;
                        toDeep = true;

                    }

                }

            }

            if (amountOfKMThatCanBeSailed >= requestedAmountOfKMToSail) {
                if (wantToDive) {
                    amountOfUsageLitersPerKm *= 2;
                }
                useFuel(vesselObj, requestedAmountOfKMToSail, amountOfUsageLitersPerKm);
                amountOfKMThatCanBeSailed = amountOfKMThatCanBeSailed - requestedAmountOfKMToSail;
                hasSailed = true;
                showNavigationInfo(vessel, amountOfKMThatCanBeSailed);

            } else {
                if (!wantToDive) {
                    informUser.wrongInput();
                    informUser.showHowMuchKMCanBeSailed(amountOfKMThatCanBeSailed);
                }
                if (toDeep) {
                    informUser.toDeep();
                }
            }

        } while (!hasSailed);

    }

    private void showNavigationInfo(Object vessel, double amountOfKMThatCanBeSailed) {
        informUser.showAmountOfFuel(vessel);
        informUser.showAmountOfUsageLitersPerKilometer(vessel);
        informUser.showHowMuchKMCanBeSailed(amountOfKMThatCanBeSailed);
    }

    public double calculateAmountOfKMThatCanBeSailed(double amountOfFuel, double amountOfUsageLitersPerKm, boolean wantToDive) {
        if (wantToDive) {
            return amountOfFuel / (amountOfUsageLitersPerKm * 2);
        }
        return amountOfFuel / amountOfUsageLitersPerKm;

    }

    public void useFuel(Vessel vessel, double requestedAmountOfKMToSail, double amountOfUsageLitersPerKm) {
        double noKilometersRequested = 0;

        if (requestedAmountOfKMToSail == noKilometersRequested) {
            return;
        }

        double amountOfFuelNeeded = amountOfUsageLitersPerKm * requestedAmountOfKMToSail;
        vessel.setFuelAmount(vessel.getFuelAmount() - amountOfFuelNeeded);

    }

}
