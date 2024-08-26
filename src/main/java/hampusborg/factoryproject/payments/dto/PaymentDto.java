package hampusborg.factoryproject.payments.dto;

import hampusborg.factoryproject.payments.enums.PaymentMethod;

import java.math.BigDecimal;

public class PaymentDto {
    public BigDecimal amount;
    public PaymentMethod paymentMethod;
}