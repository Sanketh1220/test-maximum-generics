package com.genericsTestMaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumJunitTest {
	
@Test
    void GivenString_MaxNumber_FirstPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxString = new MaximumNumber();
        String max = maxString.getMaxString("Peach", "Apple", "Banana");
        Assertions.assertEquals( "Peach", max);
    }
    @Test
    void GivenString_MaxNumber_SecondPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxString = new MaximumNumber();
        String max = maxString.getMaxString("Apple","Peach", "Banana");
        Assertions.assertEquals( "Peach", max);
    }
    @Test
    void GivenString_MaxNumber_ThirdPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxString = new MaximumNumber();
        String max = maxString.getMaxString("Banana", "Apple", "Peach");
        Assertions.assertEquals( "Peach", max);
    }
}
