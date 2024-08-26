package hampusborg.factoryproject;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.MessageFormat;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println(MessageFormat.format("Successfully payed ${0} to merchant using Credit Card", amount));
    }
}
