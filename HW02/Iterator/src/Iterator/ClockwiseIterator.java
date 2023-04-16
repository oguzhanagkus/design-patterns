package Iterator;

import java.util.ArrayList;

/**
 * Clockwise traversing 2D matrix.
 */
public class ClockwiseIterator implements GokturkIterator {
    private ArrayList<Integer> data = new ArrayList<>();
    private int position = 0;

    /**
     * Default constructor
     * @param data 2D matrix
     */
    public ClockwiseIterator(int[][] data) {
        convert(data, 0, 0, data[0].length, data.length);
    }

    /**
     * Traverse matrix in clockwise rotation and store to arraylist.
     * @param data input matrix
     * @param x start value
     * @param y start value
     * @param size size
     * @param len length
     */
    private void convert(int[][] data, int x, int y, int size, int len) {
        for (int i = x; i < size; i++)
            this.data.add(data[x][i]);

        for (int i = y + 1; i < len; i++)
            this.data.add(data[i][size - 1]);

        if(x + 1 < len) {
            for(int i = size - 2; i > y; i--)
                this.data.add(data[len - 1][i]);
        }

        if(y + 1 < size) {
            for(int i = len - 1; i > x; i--)
                this.data.add(data[i][y]);
        }

        if(x + 1 < len - 1 && y + 1 < size - 1)
            convert(data, x + 1, y + 1, size - 1, len - 1);
    }

    /**
     * Check it has next element
     * @return has next element or not
     */
    @Override
    public boolean hasNext() {
        return position < this.data.size();
    }

    /**
     * Return next item.
     * @return next item
     */
    @Override
    public Integer next() {
        int value = this.data.get(this.position);
        this.position += 1;
        return value;
    }
}
