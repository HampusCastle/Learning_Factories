package hampusborg.factoryproject.payments.impl;

import hampusborg.factoryproject.payments.PaymentService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.MessageFormat;

@Component
public class CreditCardPaymentService implements PaymentService {
    @Override
    public String pay(BigDecimal amount) {
        return MessageFormat.format("Successfully paid ${0} to merchant using a Credit Card", amount);
    }
}
