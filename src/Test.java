/**
 * Created by Yulong on 9/16/2016.
 */

public class Test {
    public static void main(String[] args) {
        PracticeArray array = new PracticeArray();
        for (int i = 0; i < 5; i++) {
            array.add(i);
        }
        System.out.println("Initial array: " + array.toString());
        array.remove(array.size() - 1); // removes 4
        System.out.println("Remove at end: " + array.toString()); // [0, 1, 2, 3]
        array.remove(0); // removes 0
        System.out.println("Remove at front: " + array.toString()); // [1, 2, 3]
        array.remove(1);
        System.out.println("Removed first index: " + array.toString()); // [1, 3]
    }
}
