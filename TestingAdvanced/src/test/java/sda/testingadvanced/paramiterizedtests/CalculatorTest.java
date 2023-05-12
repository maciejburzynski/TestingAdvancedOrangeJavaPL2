package sda.testingadvanced.paramiterizedtests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import sda.testingadvanced.tdd.Calculator;

public class CalculatorTest {

//    CSV -> Comma separated value
//    1,2,3
//    5,5,10

//  a,b,expected
//  1,2,3
//  5,5,10
    @ParameterizedTest
    @CsvFileSource(resources = "data-addition.csv")
    void whenAddTwoIntegersThenReturnsSumOfTheseIntegers(int a, int b, int expected){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.addTwoIntegers(a, b);
        //then
        Assertions.assertEquals(expected, result);
//        Assertions.assertNotEquals(expected, result);
    }
}
