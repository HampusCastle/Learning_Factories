package hampusborg.factoryproject.payments;

import java.math.BigDecimal;

public interface PaymentService {
    String pay(BigDecimal amount);
}
