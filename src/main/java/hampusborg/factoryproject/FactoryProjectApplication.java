package hampusborg.factoryproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class FactoryProjectApplication {

    public FactoryProjectApplication() throws ClassNotFoundException {
    }

    public static void main(String[] args) {
        SpringApplication.run(FactoryProjectApplication.class, args);
    }
{
    try {
        Payment payment = PaymentFactory.create(PaymentMethod.APPLE_PAY);
        payment.pay(new BigDecimal("1000.00"));
    } catch (ClassNotFoundException e){
        e.printStackTrace();
    }
}}

