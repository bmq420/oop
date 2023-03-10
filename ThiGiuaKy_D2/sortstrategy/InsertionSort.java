package ThiGiuaKy_D2.sortstrategy;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int count = 0;
        int length = data.length;
        for (int i = 1; i < length; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                count++;
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        return count;
    }
}
