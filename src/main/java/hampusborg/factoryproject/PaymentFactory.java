package hampusborg.factoryproject;

import java.text.MessageFormat;

public class PaymentFactory {
    public static Payment create(PaymentMethod paymentMethod) throws ClassNotFoundException {
        switch(paymentMethod){
            case CREDIT_CARD -> {
                return new CreditCardPayment();
            }
            case PAYPAL -> {
                return new PayPalPayment();
            }
            case GOOGLE_PAY -> {
                return new GooglePayPayment();
            }
            default -> {
                throw new ClassNotFoundException(MessageFormat.format(
                        "${0} is not currently supported as a payment method", paymentMethod
                ));
            }
        }
    }
}
