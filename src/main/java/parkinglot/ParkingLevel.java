package parkinglot;

import java.util.List;

public class ParkingLevel {
    private List<ParkingSpace> parkingSpots;
    private int levelNumber;

    public List<ParkingSpace> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpace> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public ParkingLevel(List<ParkingSpace> parkingSpots, int levelNumber) {
        this.parkingSpots = parkingSpots;
        this.levelNumber = levelNumber;
    }

}
