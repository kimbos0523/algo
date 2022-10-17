package sort;

/**
 * Fina the min number and move it to the front
 * O(n^2)
 */
public class SelectionSort {

    /**
     * Find the min number and move it to the most front and loop again
     * @param arr the given array
     */
    void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
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
        SelectionSort ss = new SelectionSort();
        int arr[] = {2, 5, 3, 4, 1, 7, 6};
        ss.printArray(arr);
        ss.sort(arr);
        ss.printArray(arr);
    }
}
