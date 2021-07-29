import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

     @Test
     public void testFirstInputOfOne(){
         //Given I am the user - expected 1 to be returned
         int input = 1;
         //When I enter 1 into function

         FizzInterface fb = new FizzBuzz();
         String actual = fb.fizzFunction(input);

         //Then I should get back 1
         assertEquals("1", actual);
     }
     @Test
     public void testSecondInputOfTwo(){
         //Given I am the user - expected 1,2 to be returned
         int input = 2;
         //When I enter pass 2 into function

         FizzInterface fb = new FizzBuzz();
         String actual = fb.fizzFunction(input);

         //Then I should get back 1, 2
         assertEquals("1,2", actual);
     }
     @Test
    public void testFirstMultipleOfThreePrintsFizz(){
        //Given
         FizzInterface fb = new FizzBuzz();

         //When
        int input = 3;
        String result = fb.fizzFunction(input);
         //THen
        assertTrue(result.endsWith("Fizz"));
     }

    @Test
    public void testFirstMultipleOfFivePrintsBuzz(){
        //Given
        FizzInterface fb = new FizzBuzz();

        //When
        int input = 5;
        String result = fb.fizzFunction(input);
        //THen
        assertTrue(result.endsWith("Buzz"));
    }
    @Test
    public void test6PrintsFizz(){
        //Given
        FizzInterface fb = new FizzBuzz();

        //When
        int input = 6;
        String result = fb.fizzFunction(input);
        //THen
        assertTrue(result.endsWith("Fizz"));
    }
    @Test
    public void test10PrintsBuzz(){
        //Given
        FizzInterface fb = new FizzBuzz();

        //When
        int input = 10;
        String result = fb.fizzFunction(input);
        //THen
        assertTrue(result.endsWith("Buzz"));
    }
    @Test
    public void test30PrintsFizzBuzz(){
        //Given
        FizzInterface fb = new FizzBuzz();

        //When
        int input = 30;
        String result = fb.fizzFunction(input);
        //THen
        assertTrue(result.endsWith("FizzBuzz"));
    }
    @Test
    public void testForValidInput1InRange(){

         ValidatorInterface validator = new Validator();
         Boolean result = validator.validate(1);
         assertTrue(result);
    }
    @Test
    public void testForNumber0InvalidInputNotInRange(){

        ValidatorInterface validator = new Validator();
        Boolean result = validator.validate(0);
        assertFalse(result);
    }
    @Test
    public void testForNumber301InvalidInputNotInRange(){

        ValidatorInterface validator = new Validator();
        Boolean result = validator.validate(301);
        assertFalse(result);
    }








//   @Test(expected = NumberFormatException.class)
//    public void throwexceptiontestForNonIntegers(){
//
//        ValidatorInterface validator = new Validator();
//        Boolean result = validator.validate("Test");
//        assertTrue(result);
//    }
}
