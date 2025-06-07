package parkinglot;

import java.util.List;

public class ParkingLot {
    private List<ParkingLevel> parkingLevels;
    private int totalSpaces;
    private int availableSpaces;

    public ParkingLot(List<ParkingLevel> parkingLevels) {
        this.parkingLevels = parkingLevels;
        this.totalSpaces = calculateTotalSpaces();
        this.availableSpaces = totalSpaces; // Initially, all spaces are available
    }
    private int calculateTotalSpaces() {
        int total = 0;
        for (ParkingLevel level : parkingLevels) {
            total += level.getParkingSpots().size();
        }
        return total;
    }

}
