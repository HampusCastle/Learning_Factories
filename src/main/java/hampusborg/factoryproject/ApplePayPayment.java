package hampusborg.factoryproject;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class ApplePayPayment implements Payment {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println(MessageFormat.format("Successfully payed ${0} to merchant using Apple Pay", amount));
    }
}
