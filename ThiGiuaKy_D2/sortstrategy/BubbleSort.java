package ThiGiuaKy_D2.sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int count = 0;
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (data[j + 1] < data[j]) {
                    count++;
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return count;
    }
}
