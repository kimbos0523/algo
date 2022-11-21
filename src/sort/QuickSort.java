package sort;

/**
 * Set the pivot and divide into two part smaller and bigger
 * repeat this process
 * nlogn
 */
public class QuickSort {

    void sort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part = partition(arr, start, end);
        if (start < part - 1) {
            quickSort(arr, start, part - 1);
        }
        if (part < end) {
            quickSort(arr, part, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while(start <= end) {
            while(arr[start] < pivot) start++;
            while(pivot < arr[end]) end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    /**
     * Print the element of the array
     * @param arr the given array
     */
    void printArray(int arr[]) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int arr[] = {2, 5, 3, 4, 1, 7, 6};
        qs.printArray(arr);
        qs.sort(arr);
        qs.printArray(arr);
    }
}
