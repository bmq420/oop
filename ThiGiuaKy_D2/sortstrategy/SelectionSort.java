package ThiGiuaKy_D2.sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int count = 0;
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < length; j++) {
                if (data[j] < data[minIdx]) {
                    minIdx = j;
                }
            }
            count ++;
            int temp = data[minIdx];
            data[minIdx] = data[i];
            data[i] = temp;
        }
        return count;
    }
}
