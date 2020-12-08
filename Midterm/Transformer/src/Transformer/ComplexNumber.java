package Transformer;

/**
 * This class represents complex numbers. It has real and imagine fields: a+bi
 */
public class ComplexNumber implements Number {
    double real;
    double imagine;

    /**
     * Default constructor.
     */
    public ComplexNumber() {
        this.real = 0;
        this.imagine = 0;
    }

    /**
     * Constructor with only real value.
     * @param real real value
     */
    public ComplexNumber(double real) {
        this.real = real;
        this.imagine = 0;
    }

    /**
     * Constructor with real and imagine values.
     * @param real real value
     * @param imagine imagine value
     */
    public ComplexNumber(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    /**
     * Set new real value.
     * @param real new value
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * Set new imagine value.
     * @param imagine new value
     */
    public void setImagine(double imagine) {
        this.imagine = imagine;
    }

    /**
     * Get real value
     * @return real value
     */
    public double getReal() {
        return real;
    }

    /**
     * Get imagine value
     * @return imagine value
     */
    public double getImagine() {
        return imagine;
    }

    /**
     * @return complex number in a+bi format
     */
    @Override
    public String toString() {
        String output;

        output = String.format("%.3f", real);

        if (imagine < 0) {
            output += String.format("%.3fi", imagine);
        }
        else {
            output += String.format("+%.3fi", imagine);
        }

        return output;
    }
}
