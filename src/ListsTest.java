import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class ListsTest {

    @Test
    public void toBinary() {
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 2343, 6454, 4, 10, 1312, 10};
        System.out.println(Arrays.toString(Lists.toBinary(MyList)));
        int[] MyList2 = {2};
        System.out.println(Arrays.toString(Lists.toBinary(MyList2)));
    }

    @Test
    public void counter() {
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 2343, 6454, 4, 10, 1312, 10};
        int[] MyList2 = {};
        System.out.println(Lists.counter(MyList, 10));
        System.out.println(Lists.counter(MyList, 0));
        System.out.println(Lists.counter(MyList2, 10));
    }

    @Test
    public void maxArray() {
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 2343, 6454, 4, 10, 1312, 10};
        int[] MyList2 = {0, 234, -34, 234234, -24};
        int[] MyList3 = {-23, -2423, -234};
        System.out.println(Lists.maxArray(MyList));
        System.out.println(Lists.maxArray(MyList2));
        System.out.println(Lists.maxArray(MyList3));
    }

    @Test
    public void bubbleSort() {
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 2343, 6454, 4, 10, 1312, 10};
        System.out.println(Arrays.toString(Lists.bubbleSort(MyList)));
    }

    @Test
    public void quickSort() {
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 2343, 6454, 4, 10, 1312, 10};
        System.out.println(Arrays.toString(Lists.quickSort(MyList)));
    }

}