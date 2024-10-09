import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class ListsTest {

    @Test
    public void toBinary() {
        String[] expected= {"0000000001100", "0000000000110", "0000110011101",
                "0000000000001", "0000010011001", "0000000001010",
                "0000000001010", "0000000001010", "0000000001010",
                "0100100100111", "1100100110110", "0000000000100",
                "0000000001010", "0010100100000", "0000000001010"};
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 2343, 6454, 4, 10, 1312, 10};
        String[] actual =Lists.toBinary(MyList);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void counter() {
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 2343, 6454, 4, 10, 1312, 10};
        int[] MyList2 = {};
        int expected, actual;
        expected = 6;
        actual = Lists.counter(MyList, 10);
        Assert.assertEquals(expected, actual);
        expected = 0;
        actual = Lists.counter(MyList, 0);
        Assert.assertEquals(expected, actual);
        expected = 0;
        actual = Lists.counter(MyList2, 10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxArray() {
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 2343, 6454, 4, 10, 1312, 10};
        int[] MyList2 = {0, 234, -34, 234234, -24};
        int[] MyList3 = {-23, -2423, -234};
        int expected, actual;
        expected = 6454;
        actual = Lists.maxArray(MyList);
        Assert.assertEquals(expected, actual);
        expected = 234234;
        actual = Lists.maxArray(MyList2);
        Assert.assertEquals(expected, actual);
        expected = -23;
        actual = Lists.maxArray(MyList3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void bubbleSort() {
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 2343, 6454, 4, 10, 1312, 10};
        int[] expected = {1, 4, 6, 10, 10, 10, 10, 10, 10, 12, 153, 413, 1312, 2343, 6454};
        int[] actual = Lists.bubbleSort(MyList);
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void quickSort() {
        int[] MyList = {12, 6, 413, 1, 153, 10, 10, 10, 10, 2343, 6454, 4, 10, 1312, 10};
        int[] expected = {1, 4, 6, 10, 10, 10, 10, 10, 10, 12, 153, 413, 1312, 2343, 6454};
        int[] actual = Lists.quickSort(MyList);
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

}