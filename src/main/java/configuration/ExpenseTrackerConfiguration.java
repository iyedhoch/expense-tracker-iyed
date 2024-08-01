package configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = "com.proxym.expense.tracker")
public class ExpenseTrackerConfiguration {
}
