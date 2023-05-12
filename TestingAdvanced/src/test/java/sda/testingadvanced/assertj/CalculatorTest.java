package sda.testingadvanced.assertj;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import sda.testingadvanced.tdd.Calculator;

import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {


    @Test
    void whenAddTwoIntegersThenReturnsSumOfTheseIntegers(){
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.addTwoIntegers(2,3);
        //then
        assertThat(result).isEqualTo(5);
    }
}
