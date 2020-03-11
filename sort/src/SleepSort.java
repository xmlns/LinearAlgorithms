/*
 * Amogh Kulkarni 3/11
 */
public class SleepSort {
    private int[] sortMe;

    public SleepSort(int[] unsortedArray) {
        sortMe = unsortedArray;
    }

    public void sort() {
        for (int i : sortMe) {
            int number = i;
            new Thread("" + i) {
                public void run() {
                    try {
                        // Wait 100ms and sleep
                        Thread.sleep(100L + number * 100L);
                        System.out.print(number + " ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}