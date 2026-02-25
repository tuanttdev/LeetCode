import java.util.Arrays;

public class day4 {
    public int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public void quickSort(int[] arr, int begin, int end) {

        if (begin < end) {
            int partitionIndex = this.partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);

        }
    }

    public void mergeSort(int[] arr) {

    }

    public void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_idx] > arr[j]) {
                    min_idx = j;

                }

            }
            int swapTemp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = swapTemp;
        }

    }

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        while (n > 0) {
            swapped = false;
            int i = 0;
            while (i < n - 1) {
                int j = i + 1;
                if (arr[i] > arr[j]) {
                    int swapTemp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swapTemp;
                    swapped = true;
                }
                i++;
            }
            n--;
            // if no two elements were swapped by inner loop, then break s
            if (swapped == false) {
                System.err.println("break with n = " + n);
                break;
            }
        }

    }

    public static void main(String[] args) {

        day4 a = new day4();
        int[] arr = new int[] { 1, 6, 5, 4, 4, -1, -5, 0 };
        // a.quickSort(arr, 0, arr.length - 1);
        // a.selectionSort(arr);
        a.bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

}
