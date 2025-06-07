package parkinglot;

/**
 * Represents a parking space in the parking lot.
 * This class contains information about the parking space, such as its ID, size, and availability.
 * @author [Raghav Singh]
 * @version 1.0
 **/

public class ParkingSpace {

    private String spaceId; // Unique identifier for the parking space

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
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

    public ParkingSpace(String spaceId, ParkingSpaceType size) {
        this.spaceId = spaceId;
        this.size = size;
        this.isAvailable = true; // Initially, the parking space is available
    }

}
