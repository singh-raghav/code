package parkinglot;

import java.util.List;

public class ParkingLevel {
    private List<ParkingSpot> parkingSpots;
    private int levelNumber;

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public ParkingLevel(List<ParkingSpot> parkingSpots, int levelNumber) {
        this.parkingSpots = parkingSpots;
        this.levelNumber = levelNumber;
    }

}
