package Transformer;

/**
 * This is my driver class.
 * It runs 3 different transformation for same input.
 */
public class Demo {
    /**
     * Main method
     * @param args input file
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Only one argument (filename) need!");
            System.exit(1);
        }

        Transform DCT = new DiscreteCosineTransform(args[0]);
        Transform DFT = new DiscreteFourierTransform(args[0]);
        Transform DFT_ = new DiscreteFourierTransform(args[0], true);

        System.out.println("Discrete Cosine Transform:");
        DCT.execute();
        System.out.println("--------------------------------------------------");
        System.out.println("Discrete Fourier Transform");
        DFT.execute();
        System.out.println("--------------------------------------------------");
        System.out.println("Discrete Fourier Transform with Execution Time");
        DFT_.execute();
    }
}
