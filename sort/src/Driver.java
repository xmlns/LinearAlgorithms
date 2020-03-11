/*
 * Amogh Kulkarni 3/11
 */
public class Driver {
    public static void main(String[] args) {
        int[] unsortedArray = Util.makeRandomInts(10);

        /* Sleep Sort */
        SleepSort sleepSort = new SleepSort(unsortedArray);
        sleepSort.sort();

        //TODO: /* Merge Sort */
    }
}
