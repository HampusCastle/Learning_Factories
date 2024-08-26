package hampusborg.factoryproject;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class PayPalPayment implements Payment {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println(MessageFormat.format("Successfully payed ${0} to merchant using PayPal", amount));
    }
}
