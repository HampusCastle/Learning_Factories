package hampusborg.factoryproject.payments.controllers;


import hampusborg.factoryproject.payments.PaymentFactory;
import hampusborg.factoryproject.payments.PaymentService;
import hampusborg.factoryproject.payments.dto.PaymentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/payments")
public class PaymentController {

    private final PaymentFactory paymentFactory;

    @Autowired
    public PaymentController(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    @PostMapping(path = "/makePayment")
    public ResponseEntity<String> pay(@RequestBody PaymentDto paymentDto) {
        try {
            PaymentService paymentService = paymentFactory.create(paymentDto.paymentMethod);
            return new ResponseEntity<>(paymentService.pay(paymentDto.amount), HttpStatus.OK);
        } catch (ClassNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}