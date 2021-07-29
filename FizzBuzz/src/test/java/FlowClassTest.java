import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class FlowClassTest {

    @Test
    public void testInputOf1InvokesIsIntMethodOnce() {
        //Given and that input is an integer 1
        //WHen I call my IntegerChecker.isINT
        IIntegerChecker mockIntChecker = mock(IIntegerChecker.class);
        ValidatorInterface mockValChecker = mock(ValidatorInterface.class);
        FizzInterface mockFizz = mock(FizzInterface.class);

        IFlowClass flowClass = new FlowClass(mockIntChecker,mockValChecker,mockFizz);

        given(mockIntChecker.isInt("1")).willReturn(true);
        given(mockValChecker.validate(1)).willReturn(true);
        given(mockFizz.fizzFunction(1)).willReturn("1");

        flowClass.flow("1");
        //Then the integerchecker method is called one time
        verify(mockIntChecker, times(1)).isInt(anyString());
    }
    @Test
    public void testInputOf1InvokesValidateMethodOnce() {
        //Given
        //And that input is an integer 1
        int given = 1;
        //WHen
        //I call my IntegerChecker.isINT
        IIntegerChecker mockIntChecker = mock(IIntegerChecker.class);
        ValidatorInterface mockValChecker = mock(ValidatorInterface.class);
        FizzInterface mockFizz = mock(FizzInterface.class);

        IFlowClass flowClass = new FlowClass(mockIntChecker,mockValChecker,mockFizz);

        given(mockIntChecker.isInt("1")).willReturn(true);
        given(mockValChecker.validate(1)).willReturn(true);
        given(mockFizz.fizzFunction(1)).willReturn("1");

        flowClass.flow("1");
        //Then the integerchecker method is called one time
        verify(mockValChecker, times(1)).validate(1);
    }
    @Test
    public void testInputOf1InvokesFizzFunctionMethodOnce() {
        //Given
        //And that input is an integer 1
        int given = 1;
        //WHen
        //I call my IntegerChecker.isINT
        IIntegerChecker mockIntChecker = mock(IIntegerChecker.class);
        ValidatorInterface mockValChecker = mock(ValidatorInterface.class);
        FizzInterface mockFizz = mock(FizzInterface.class);

        IFlowClass flowClass = new FlowClass(mockIntChecker,mockValChecker,mockFizz);

        given(mockIntChecker.isInt("1")).willReturn(true);
        given(mockValChecker.validate(1)).willReturn(true);
        given(mockFizz.fizzFunction(1)).willReturn("1");

        flowClass.flow("1");
        //Then the integerchecker method is called one time
        verify(mockFizz, times(1)).fizzFunction(1);
    }

    //Given I am a user when I ender ABC the int checker gets called

    @Test
    public void testInputOfZeroInvokesIsIntMethodOnce() {
        //Given
        //And that input is an integer 1
        int given = 1;
        //WHen
        //I call my IntegerChecker.isINT
        IIntegerChecker mockIntChecker = mock(IIntegerChecker.class);
        ValidatorInterface mockValChecker = mock(ValidatorInterface.class);
        FizzInterface mockFizz = mock(FizzInterface.class);

        IFlowClass flowClass = new FlowClass(mockIntChecker,mockValChecker,mockFizz);

        given(mockIntChecker.isInt("0")).willReturn(true);
        given(mockValChecker.validate(0)).willReturn(false);
        given(mockFizz.fizzFunction(0)).willReturn(anyString());

        flowClass.flow("0");
        //Then the integerchecker method is called one time
        verify(mockIntChecker, times(1)).isInt(anyString());
    }
    @Test
    public void testInputOfZeroInvokesValidateMethodOnce() {
        //Given I enter the number 0
        //WHen I call my integer checker it passes to the validate range method
        IIntegerChecker mockIntChecker = mock(IIntegerChecker.class);
        ValidatorInterface mockValChecker = mock(ValidatorInterface.class);
        FizzInterface mockFizz = mock(FizzInterface.class);

        IFlowClass flowClass = new FlowClass(mockIntChecker,mockValChecker,mockFizz);

        given(mockIntChecker.isInt("0")).willReturn(true);
        given(mockValChecker.validate(0)).willReturn(false);
        given(mockFizz.fizzFunction(0)).willReturn(anyString());

        flowClass.flow("0");
        //Then the validate range method is invoked one time
        verify(mockValChecker, times(1)).validate(0);
    }
    @Test
    public void testInputOfZeroNeverInvokesFizzFunctionMethod() {
        //Given
        //And that input is an integer 1
        int given = 1;
        //WHen
        //I call my IntegerChecker.isINT
        IIntegerChecker mockIntChecker = mock(IIntegerChecker.class);
        ValidatorInterface mockValChecker = mock(ValidatorInterface.class);
        FizzInterface mockFizz = mock(FizzInterface.class);

        IFlowClass flowClass = new FlowClass(mockIntChecker,mockValChecker,mockFizz);

        given(mockIntChecker.isInt("0")).willReturn(true);
        given(mockValChecker.validate(0)).willReturn(false);
        given(mockFizz.fizzFunction(0)).willReturn(anyString());

        flowClass.flow("1");
        //Then the integerchecker method is called one time
        verify(mockFizz, times(0)).fizzFunction(1);
    }

    @Test
    public void givenABCThenIntegerCheckerMethodIsCalledOnce(){
        IIntegerChecker mockIntChecker = mock(IIntegerChecker.class);
        ValidatorInterface mockValChecker = mock(ValidatorInterface.class);
        FizzInterface mockFizz = mock(FizzInterface.class);

        IFlowClass flowClass = new FlowClass(mockIntChecker,mockValChecker,mockFizz);

        given(mockIntChecker.isInt("ABC")).willReturn(false);
        given(mockValChecker.validate(0)).willReturn(false);
        given(mockFizz.fizzFunction(0)).willReturn(anyString());

        flowClass.flow("ABC");
        //Then the integerchecker method is called one time
        verify(mockIntChecker, times(1)).isInt(anyString());

    }
    @Test
    public void givenABCThenValidatorMethodIsNeverCalled(){
        IIntegerChecker mockIntChecker = mock(IIntegerChecker.class);
        ValidatorInterface mockValChecker = mock(ValidatorInterface.class);
        FizzInterface mockFizz = mock(FizzInterface.class);

        IFlowClass flowClass = new FlowClass(mockIntChecker,mockValChecker,mockFizz);

        given(mockIntChecker.isInt("ABC")).willReturn(false);
        given(mockValChecker.validate(0)).willReturn(false);
        given(mockFizz.fizzFunction(0)).willReturn(anyString());

        flowClass.flow("ABC");
        //Then the integerchecker method is called one time
        verify(mockValChecker, times(0)).validate(0);

    }
    @Test
    public void givenABCThenFizzFunctionIsNeverCalled(){
        IIntegerChecker mockIntChecker = mock(IIntegerChecker.class);
        ValidatorInterface mockValChecker = mock(ValidatorInterface.class);
        FizzInterface mockFizz = mock(FizzInterface.class);

        IFlowClass flowClass = new FlowClass(mockIntChecker,mockValChecker,mockFizz);

        given(mockIntChecker.isInt("ABC")).willReturn(false);
        given(mockValChecker.validate(0)).willReturn(false);
        given(mockFizz.fizzFunction(0)).willReturn(anyString());

        flowClass.flow("ABC");
        //Then the integerchecker method is called one time
        verify(mockFizz, times(0)).fizzFunction(1);

    }

}
