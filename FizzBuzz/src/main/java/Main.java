import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
       IFlowClass fClass = context.getBean("flowClassConfig",FlowClass.class);
//        IFlowClass fClass = context.getBean(FlowClass.class);

       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter a number between 1 & 300");




       while (true) {
           String input = sc.next();
           String result = fClass.flow(input);
           System.out.println(result);
           if(input.equalsIgnoreCase("quit")){
               break;
           }
       }
    }
}
