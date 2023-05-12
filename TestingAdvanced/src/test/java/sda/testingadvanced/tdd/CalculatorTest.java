package sda.testingadvanced.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

//    @BeforeAll - run one time before first test
//    @AfterAll - run one time after last test
//    @AfterEach - run after each test
//    @BeforeEach - run before each test
    Calculator calculator;
    @BeforeEach
    void createCalculator(){
        calculator = new Calculator();
    }
    @Test
    void whenAddTwoIntegersThenReturnsSumOfTheseIntegers(){
        //when
        int result = calculator.addTwoIntegers(2,3);
        //then
        Assertions.assertEquals(5, result);
    }
    @Test
    void whenAnyComponentIsGreaterThan100ThenIllegalArgumentExceptionIsThrown(){
        //then
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.addTwoIntegers(101,2));
    }


    //Substraction (odejmowanie)
}
