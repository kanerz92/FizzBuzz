import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {


    @Bean(name = "integerChecker")
    public IntegerChecker iIntegerChecker()
    {
        return new IntegerChecker();
    }
    @Bean(name = "inputValidator")
    public Validator validatorInterface(){

        return new Validator();
    }
    @Bean(name = "fizzBuzz")
    public FizzBuzz fizzInterface(){

        return new FizzBuzz();
    }

    @Bean(name = "flowClass")
    public FlowClass createFlowCLass(){
        return new FlowClass(iIntegerChecker(),validatorInterface(),fizzInterface());
    }
}
