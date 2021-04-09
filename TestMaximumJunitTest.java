package com.genericsTestMaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumJunitTest {
	
	@Test
    void GivenFloatArray_MaxNumber_FirstPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        float max = maxNum.getFloatMaxNum(20.3f, 3.3f, 10.33f);
        Assertions.assertEquals( 20.3f, max);
    }
    @Test
    void GivenFloatArray_MaxNumber_SecondPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        float max = maxNum.getFloatMaxNum(3.32f, 20.3f, 10.33f);
        Assertions.assertEquals( 20.3f, max);
    }
    @Test
    void GivenFloatArray_MaxNumber_ThirdPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        float max = maxNum.getFloatMaxNum(3.3f, 4.33f, 10.33f);
        Assertions.assertEquals( 10.33f, max);
    }	

}
