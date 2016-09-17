/**
 * Created by Yulong on 9/16/2016.
 */

public class PracticeArray {
    public static final int DEFAULT_CAPACITY = 10;

    private int size;
    private int[] elementData;

    public PracticeArray() {
        this(DEFAULT_CAPACITY);
    }

    public PracticeArray(int size) {
        this.elementData = new int[size];
    }

    // Adding to an array (the end of the index)
    public void add(int n) {
        this.add(this.size, n);
    }

    // Adding to an array (specific index)
    // [] size: 0
    // Add 0 -> [0] size: 1
    // [0, 1, 2] size: 3
    // add(3, 3) -> [0, 1, 2, 3] size: 4
    public void add(int index, int n) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = this.size - 1; i >= index; i--) {
            if (i != index) {
                this.elementData[i] = this.elementData[i - 1];
            }
        }
        this.elementData[index] = n;
        this.size++;
    }

    // Removing something from the array (at the end)
    public void remove() {
        this.remove(this.size - 1);
    }

    // Removing something from any index
    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < this.size - 1; i++) {
            this.elementData[i] = this.elementData[i + 1];
        }
        this.size--;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        } else {
            String result = "[" + this.elementData[0];
            for (int i = 1; i < this.size; i++) {
                result += ", " + this.elementData[i];
            }
            return result + "]";
        }
    }
}
