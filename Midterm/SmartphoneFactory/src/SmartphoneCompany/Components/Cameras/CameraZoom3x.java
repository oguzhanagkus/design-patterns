package SmartphoneCompany.Components.Cameras;

/**
 * This class represents a camera which has x3 optical zoom.
 */
public class CameraZoom3x extends Camera {
    /**
     * Default constructor.
     * @param rear rear resolution in MP
     * @param front front resolution in MP
     */
    public CameraZoom3x(int rear, int front) {
        this.rear = rear;
        this.front = front;
        this.opticalZoom = 3;
    }
}
