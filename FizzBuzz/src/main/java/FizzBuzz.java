import org.springframework.stereotype.Component;


public class FizzBuzz implements FizzInterface {

    @Override
    public String fizzFunction(int input) {
        String returnValue = "";

        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                returnValue += "FizzBuzz";
            } else if (i % 5 == 0) {
                returnValue += "Buzz";
            } else if (i % 3 == 0) {
                returnValue += "Fizz";
            } else {
                returnValue += String.valueOf(i);
            }
            if (i != input) {
                returnValue += ",";
            }
        }
        return returnValue;
    }
}





