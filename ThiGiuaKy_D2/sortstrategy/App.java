package ThiGiuaKy_D2.sortstrategy;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Using Selection Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
        SortStrategy sortArray = SortStrategy.getInstance();
        int numSwap = 0;

        System.out.println("Using Bubble Sort Algorithm: ");
        int[] bubbleSortArray = new int[5];
        generateArray(bubbleSortArray);
        sortArray.setSortee(new BubbleSort());
        System.out.print("Before sorting: ");
        printArray(bubbleSortArray);

        numSwap = sortArray.sort(bubbleSortArray);
        System.out.print("After sorting: ");
        printArray(bubbleSortArray);
        System.out.println("Number of swap: " + numSwap);

        System.out.println("\nUsing Selection Sort Algorithm: ");
        int[] selectionSortArray = new int[5];
        generateArray(selectionSortArray);
        sortArray.setSortee(new SelectionSort());
        System.out.print("Before sorting: ");
        printArray(selectionSortArray);

        numSwap = sortArray.sort(selectionSortArray);
        System.out.print("After sorting: ");
        sortArray.sort(selectionSortArray);
        printArray(selectionSortArray);
        System.out.println("Number of swap: " + numSwap);

        System.out.println("\nUsing Insertion Sort Algorithm: ");
        int[] insertionSortArray = new int[5];
        generateArray(insertionSortArray);
        sortArray.setSortee(new InsertionSort());
        System.out.print("Before sorting: ");
        printArray(insertionSortArray);

        numSwap = sortArray.sort(insertionSortArray);
        System.out.print("After sorting: ");
        sortArray.sort(insertionSortArray);
        printArray(insertionSortArray);
        System.out.println("Number of swap: " + numSwap);
    }

    public static void generateArray(int[] array) {
        final int MAX = 100;
        final int MIN = 0;
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(MAX - MIN) + MIN;
        }
    }

    public static void printArray(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                result.append(array[i]);
            } else {
                result.append(array[i] + " ");
            }
        }
        result.append("]");
        System.out.println(result.toString());
    }

}
