package com.genericsTestMaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumJunitTest {

    @Test
    void GivenIntArray_MaxNumber_FirstPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        int max = maxNum.getIntMaxNum(10, 6, 1);
        Assertions.assertEquals( 10, max);
    }

    @Test
    void GivenIntArray_MaxNumber_SecondPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        int max = maxNum.getIntMaxNum(4, 9,3);
        Assertions.assertEquals( 9, max);
    }

    @Test
    void GivenIntArray_MaxNumber_ThirdPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        int max = maxNum.getIntMaxNum(4, 1, 31);
        Assertions.assertEquals( 31, max);
    }
}
