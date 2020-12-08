package Transformer;

/**
 * This class performs discrete Fourier transform.
 * The formula is gotten from Wikipedia: https://en.wikipedia.org/wiki/Discrete_Fourier_transform
 * Save the results to outputs list.
 */
public class DiscreteFourierTransform extends Transform {
    private boolean showRuntime = false;

    /**
     * Default constructor.
     * @param filename input file
     */
    public DiscreteFourierTransform(String filename) {
        super(filename);
    }

    /**
     * Constructor with runtime.
     * @param filename input file
     * @param showRuntime true or false
     */
    public DiscreteFourierTransform(String filename, boolean showRuntime) {
        super(filename);
        this.showRuntime = showRuntime;
    }

    /**
     * Performs DFT.
     */
    @Override
    void transform() {
        int size;
        double realSum;
        double imagineSum;
        double angle;

        size = numbers.size();

        for (int k = 0; k < size; k++) {
            realSum = 0;
            imagineSum = 0;

            for (int n = 0; n < size; n++) {
                angle = 2 * Math.PI * k * n / size;
                realSum += 0 * Math.sin(angle) + numbers.get(n) * Math.cos(angle);
                imagineSum += 0 * Math.cos(angle) - numbers.get(n) * Math.sin(angle);
            }
            outputs.add(new ComplexNumber(realSum, imagineSum));
        }
    }

    /**
     * Override the hook which returns false as default.
     * @return true or false
     */
    @Override
    boolean show() {
        return showRuntime;
    }
}


