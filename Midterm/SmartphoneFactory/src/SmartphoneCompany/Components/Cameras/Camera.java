package SmartphoneCompany.Components.Cameras;

/**
 * This abstract class represents a camera. Each camera has rear and front modules and they have resolution field.
 * Also they have zoom multiplier value.
 */
public abstract class Camera {
    int rear;
    int front;
    int opticalZoom;

    /**
     * @return camera specifications
     */
    @Override
    public String toString() {
        return "Camera -> Rear " + rear + "MP, front " + front + "MP, x" + opticalZoom + " optical zoom \n";
    }
}
