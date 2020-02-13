package tudelft.sum;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {
    @Test
    public void SameLength() {
        ArrayList<Integer> first =  new ArrayList<Integer>(Arrays.asList(1, 2));
        ArrayList<Integer> second =  new ArrayList<Integer>(Arrays.asList(3, 4));
        ArrayList<Integer> expected =  new ArrayList<Integer>(Arrays.asList(4, 6));

        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(first, second);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void Nine() {
        ArrayList<Integer> first =  new ArrayList<Integer>(Arrays.asList(2));
        ArrayList<Integer> second =  new ArrayList<Integer>(Arrays.asList(1, 9));
        ArrayList<Integer> expected =  new ArrayList<Integer>(Arrays.asList(2,1));

        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(first, second);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void OutputLonger() {
        ArrayList<Integer> first =  new ArrayList<Integer>(Arrays.asList(2));
        ArrayList<Integer> second =  new ArrayList<Integer>(Arrays.asList(9, 9));
        ArrayList<Integer> expected =  new ArrayList<Integer>(Arrays.asList(1,0,1));

        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(first, second);
        Assertions.assertEquals(expected, result);
    }
}
