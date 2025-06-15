package parkinglot;

/**
 * Represents a parking spot in the parking lot.
 * This class contains information about the parking spot, such as its ID, size, and availability.
 * @author [Raghav Singh]
 * @version 1.0
 **/

public class ParkingSpot {

    private String spotId; // Unique identifier for the parking space

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    private ParkingSpaceType size; // Size of the parking space (e.g., COMPACT, REGULAR, LARGE)

    public ParkingSpaceType getSize() {
        return size;
    }

    public void setSize(ParkingSpaceType size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    private boolean isAvailable; // Indicates if the parking space is currently available

    public ParkingSpot(String spotId, ParkingSpaceType size) {
        this.spotId = spotId;
        this.size = size;
        this.isAvailable = true; // Initially, the parking space is available
    }

}
