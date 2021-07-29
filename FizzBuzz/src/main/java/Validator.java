
public class Validator implements ValidatorInterface {

    @Override
    public Boolean validate(int input) {
        if (input > 0 && input <=300){
            return true;
        }
        return false;
    }
}
