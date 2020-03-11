public class Util {
    public static int[] makeRandomInts(int size) {
        int[] unsortedArray = new int[size];

        for (int i = 0; i < size; i++) {
            unsortedArray[i] = (int) (Math.random() * 10);
            System.out.print(unsortedArray[i] + " ");
        }
        System.out.println();

        return unsortedArray;
    }
}
