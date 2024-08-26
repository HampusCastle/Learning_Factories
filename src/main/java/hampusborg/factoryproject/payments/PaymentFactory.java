package hampusborg.factoryproject.payments;

import hampusborg.factoryproject.payments.enums.PaymentMethod;

public interface PaymentFactory {
    PaymentService create(PaymentMethod paymentMethod) throws ClassNotFoundException;
}
