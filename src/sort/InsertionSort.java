package sort;

/**
 * The ky start with the second element in the list. Compare the key from
 * the index 0 to the given element list and insert it to proper place
 * O(N^2)
 */
public class InsertionSort {

    /**
     * Insert the number in the right place
     * @param arr the given array
     */
    void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
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
        InsertionSort is = new InsertionSort();
        int arr[] = {2, 5, 3, 4, 1, 7, 6};
        is.printArray(arr);
        is.sort(arr);
        is.printArray(arr);
    }
}
