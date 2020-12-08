package Transformer;

/**
 * This class performs discrete cosine transform.
 * The formula is gotten from Wikipedia: https://en.wikipedia.org/wiki/Discrete_cosine_transform – DCT II
 * Save the results to outputs list.
 */
public class DiscreteCosineTransform extends Transform {
    /**
     * Default constructor.
     * @param filename input file
     */
    public DiscreteCosineTransform(String filename) {
        super(filename);
    }

    /**
     * Performs DCT-II
     */
    @Override
    void transform() {
        int size;
        double sum;
        double angle;

        size = numbers.size();

        for (int k = 0; k < size; k++) {
            sum = 0;

            for (int n = 0; n < size; n++) {
                angle = Math.PI  * (n + 0.5) * k / size;
                sum += numbers.get(n) * Math.cos(angle);
            }
            outputs.add(new RealNumber(sum));
        }
    }
}
