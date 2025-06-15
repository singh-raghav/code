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

    // Getter for parkingLevels
    public List<ParkingLevel> getParkingLevels() {
        return parkingLevels;
    }

    // Setter for parkingLevels
    public void setParkingLevels(List<ParkingLevel> parkingLevels) {
        this.parkingLevels = parkingLevels;
        this.totalSpaces = calculateTotalSpaces(); // Recalculate total spaces
        this.availableSpaces = totalSpaces; // Reset available spaces
    }

    // Getter for totalSpaces (read-only)
    public int getTotalSpaces() {
        return totalSpaces;
    }

    // Getter for availableSpaces
    public int getAvailableSpaces() {
        return availableSpaces;
    }

    // Setter for availableSpaces
    public void setAvailableSpaces(int availableSpaces) {
        if (availableSpaces >= 0 && availableSpaces <= totalSpaces) {
            this.availableSpaces = availableSpaces;
        } else {
            throw new IllegalArgumentException("Available spaces must be between 0 and total spaces.");
        }
    }


}
