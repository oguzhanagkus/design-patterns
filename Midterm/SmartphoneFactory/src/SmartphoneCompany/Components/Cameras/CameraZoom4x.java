package SmartphoneCompany.Components.Cameras;

/**
 * This class represents a camera which has x4 optical zoom.
 */
public class CameraZoom4x extends Camera {
    /**
     * Default constructor.
     * @param rear rear resolution in MP
     * @param front front resolution in MP
     */
    public CameraZoom4x(int rear, int front) {
        this.rear = rear;
        this.front = front;
        this.opticalZoom = 4;
    }
}
