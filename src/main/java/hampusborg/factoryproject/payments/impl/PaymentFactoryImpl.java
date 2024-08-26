package hampusborg.factoryproject.payments.impl;

import hampusborg.factoryproject.payments.PaymentFactory;
import hampusborg.factoryproject.payments.PaymentService;
import hampusborg.factoryproject.payments.enums.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
public class PaymentFactoryImpl implements PaymentFactory {

    private final CreditCardPaymentService creditCardPaymentService;
    private final ApplePayPaymentService applePayPaymentService;
    private final GooglePayPaymentService googlePayPaymentService;
    private final PayPalPaymentService payPalPaymentService;

    @Autowired
    public PaymentFactoryImpl(CreditCardPaymentService creditCardPaymentService,
                              ApplePayPaymentService applePayPaymentService,
                              GooglePayPaymentService googlePayPaymentService,
                              PayPalPaymentService payPalPaymentService) {
        this.creditCardPaymentService = creditCardPaymentService;
        this.applePayPaymentService = applePayPaymentService;
        this.googlePayPaymentService = googlePayPaymentService;
        this.payPalPaymentService = payPalPaymentService;
    }


    public PaymentService create(PaymentMethod paymentMethod) throws ClassNotFoundException {
        switch(paymentMethod){
            case CREDIT_CARD -> {
                return creditCardPaymentService;
            }
            case PAYPAL -> {
                return payPalPaymentService;
            }
            case GOOGLE_PAY -> {
                return googlePayPaymentService;
            }
            case APPLE_PAY -> {
                return applePayPaymentService;
            }
            default -> {
                throw new ClassNotFoundException(MessageFormat.format(
                        "${0} is not currently supported as a payment method", paymentMethod
                ));
            }
        }
    }
}
