
public class FlowClass implements IFlowClass {

    private IIntegerChecker _intChecker;
    private ValidatorInterface _validator;
    private FizzInterface _fizz;


    public FlowClass(IIntegerChecker intChecker, ValidatorInterface validator, FizzInterface fizz) {
        this._intChecker = intChecker;
        this._validator = validator;
        this._fizz = fizz;
    }
    @Override
    public String flow(String input) {
        boolean result = _intChecker.isInt(input);
        if (result) {
            int validInput = Integer.parseInt(input);
            boolean isInRange = _validator.validate(validInput);
            if (isInRange) {
                String fbString = _fizz.fizzFunction(validInput);
                return fbString;
            }
        }
        return "Invalid input, please enter an integer";
    }
}











