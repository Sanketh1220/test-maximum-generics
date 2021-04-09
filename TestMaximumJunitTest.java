package com.genericsTestMaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumJunitTest {

    @Test
    void GivenInt_MaxNumber_FirstPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        Comparable max = maxNum.getMax(10, 6, 1);
        Assertions.assertEquals( 10, max);
    }

    @Test
    void GivenInt_MaxNumber_SecondPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        Comparable max = maxNum.getMax(4, 9,3);
        Assertions.assertEquals( 9, max);
    }

    @Test
    void GivenInt_MaxNumber_ThirdPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        Comparable max = maxNum.getMax(4, 1, 31);
        Assertions.assertEquals( 31, max);
    }

    @Test
    void GivenFloat_MaxNumber_FirstPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        Comparable max = maxNum.getMax(20.3f, 3.3f, 10.33f);
        Assertions.assertEquals( 20.3f, max);
    }
    @Test
    void GivenFloat_MaxNumber_SecondPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        Comparable max = maxNum.getMax(3.32f, 20.3f, 10.33f);
        Assertions.assertEquals( 20.3f, max);
    }
    @Test
    void GivenFloat_MaxNumber_ThirdPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxNum = new MaximumNumber();
        Comparable max = maxNum.getMax(3.3f, 4.33f, 10.33f);
        Assertions.assertEquals( 10.33f, max);
    }

    @Test
    void GivenString_MaxNumber_FirstPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxString = new MaximumNumber();
        Comparable max = maxString.getMax("Peach", "Apple", "Banana");
        Assertions.assertEquals( "Peach", max);
    }
    @Test
    void GivenString_MaxNumber_SecondPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxString = new MaximumNumber();
        Comparable max = maxString.getMax("Apple","Peach", "Banana");
        Assertions.assertEquals( "Peach", max);
    }
    @Test
    void GivenString_MaxNumber_ThirdPosition_ReturnsTrue_IfSameAsExpected(){
        MaximumNumber maxString = new MaximumNumber();
        Comparable max = maxString.getMax("Banana", "Apple", "Peach");
        Assertions.assertEquals( "Peach", max);
    }
}


