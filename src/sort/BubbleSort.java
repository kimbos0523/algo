package sort;

/**
 * Compare the consecutive two numbers and switch it if the order is wrong.
 * After the first process, we can fix the largest number located in right most.
 * Repeat this process to find the next biggest number.
 * O(N^2). It seems like same as selection sort but if we see the real number of implementation,
 * it is the slowest algorithm
 */
public class BubbleSort {

    /**
     * Compare the consecutive two numbers and switch them if the order of numbers
     * is wrong.
     * @param arr the given array
     */
    void sort(int arr[]) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        BubbleSort bs = new BubbleSort();
        int arr[] = {2, 5, 3, 4, 1, 7, 6};
        bs.printArray(arr);
        bs.sort(arr);
        bs.printArray(arr);
    }
}
