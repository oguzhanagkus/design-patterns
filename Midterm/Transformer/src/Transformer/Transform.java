package Transformer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This abstract class represents transforms. This is a template for different transforms. For example, DCT or DFT.
 * The execution order is certain. It cannot be changed.
 * Firstly, it reads from file. Then perform transform operations. Finally writes to file.
 * It also calculates execution time but it is not shown by default.
 */
public abstract class Transform {
    String inputFile;
    String outputFile;
    ArrayList<Double> numbers;
    ArrayList<Number> outputs;

    long start; // Start time in ms
    long end; // End time in ms

    /**
     * Default constructor.
     * @param filename input file
     */
    public Transform(String filename) {
        this.inputFile = filename;
        this.outputFile = "output.txt";
        this.numbers = new ArrayList<>();
        this.outputs = new ArrayList<>();
    }

    /**
     * Execution template.
     */
    final void execute() {
        start = System.currentTimeMillis();
        read();
        transform();
        write();
        end = System.currentTimeMillis();

        if (show()) {
            runtime();
        }
    }

    /**
     * Transform method. Subclasses must implement it. And store the results in outputs.
     */
    abstract void transform();

    /**
     * Read numbers from file. The numbers should be tab "\t" separated.
     * This method can be used directly. It is supposed/recommended to.
     */
    void read() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            String[] splitted;

            while (true) {
                line = reader.readLine();
                if (line == null) {
                    break;
                } else {
                    splitted = line.split("\t");
                    for (String each : splitted) {
                        if (!each.equals("")) {
                            numbers.add(Double.valueOf(each));
                        }
                    }
                }
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write numbers to file. Each number will be written to a new line.
     * This method can be used directly. It is supposed/recommended to.
     */
    void write() {
        try {
            FileWriter writer = new FileWriter(outputFile);
            for (Number n : outputs) {
                writer.write(n + "\n");
                //System.out.println(n);
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Show runtime.
     */
    void runtime() {
        System.out.println("Execution time: " + (end - start) + "ms");
    }

    /**
     * Should it show the run time.
     * @return false as default
     */
    boolean show() {
        return false;
    }
}