package Iterator;

/**
 * Driver class.
 */
public class Demo {
    /**
     * Main method.
     * @param args ignored
     */
    public static void main(String[] args) {
        int[][] data = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15}};

        GokturkIterator iterator = new ClockwiseIterator(data);

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}
