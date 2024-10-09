import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 232343, 6454, 4, 10, 12312, 10};
        System.out.println(Arrays.toString(quickSort(MyList)));
        System.out.println(Arrays.toString(bubbleSort(MyList)));
        System.out.println(counter(MyList, 10));
        System.out.println(maxArray(MyList));
        System.out.println(Arrays.toString(toBinary(MyList)));
    }
    public static String[] toBinary(int[] MyList){
        int maxLen = 0;
        int n = MyList.length;
        String[] bin = new String[n];

        for (int i = 0; i < n; i++) {
            bin[i] = Integer.toBinaryString(MyList[i]);
            maxLen = Math.max(maxLen, bin[i].length());
        }

        for (int i = 0; i < n; i++) {
            if (bin[i].length() != maxLen)
                bin[i] = String.format("%" + maxLen + "s", bin[i]).replace(' ', '0').replace(' ', '0');
        }
        return bin;
    }

    public static int counter(int[] MyList, int x){
        int c = 0;
        for (int i = 1; i < MyList.length; i++) {
            if (MyList[i] == x) {
                c++;
            }
        }
        return c;
    }

    public static int maxArray(int[] a) {

        int max = 0;

        for (int j = 1; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            }

        }
        return max;
    }

    public static int[] bubbleSort(int[] MyList){
        for (int i = 0; i < MyList.length - 1; i++) {
            for(int j = 0; j < MyList.length - i - 1; j++) {
                if(MyList[j + 1] < MyList[j]) {
                    int swap = MyList[j];
                    MyList[j] = MyList[j + 1];

                    MyList[j + 1] = swap;
                }
            }
        }
        return MyList;
    }

    public static int[] quickSort(int[] MyList) {
        return quickSort(MyList, 0, MyList.length - 1);
    }

    public static int[] quickSort(int[] MyList, int low, int high) {

        if (MyList.length == 0 || low >= high) return MyList;

        int middle = low + (high - low) / 2;
        int border = MyList[middle];
        int i = low, j = high;

        while (i <= j) {
            while (MyList[i] < border) i++;
            while (MyList[j] > border) j--;
            if (i <= j) {
                int swap = MyList[i];
                MyList[i] = MyList[j];
                MyList[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(MyList, low, j);
        if (high > i) quickSort(MyList, i, high);
        return MyList;
    }
}


