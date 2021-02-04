package Rasen0000.com.github.com.github;

import com.github.Rasen0000.Currency;
import com.github.Rasen0000.ErrorCodes;
import lombok.*;

import java.math.BigDecimal;
import java.util.function.Predicate;

import static com.github.Rasen0000.ErrorCodes.*;


@Getter
@Setter
public class ATM {
    private BigDecimal ATMMoney; //запас денег в банкомате
    private ErrorCodes errorState;
    Predicate<BigDecimal> n = t -> t.compareTo(BigDecimal.ZERO) > 0;

    public ATM(Currency rur, BigDecimal bigDecimal, BigDecimal bigDecimal1) {
    }


    public static ErrorCodes getErrorState() {
        return ErrorCodes.valueOf("---");
    }


    public BigDecimal getMoney(String password, BigDecimal bankAccount, BigDecimal cash) {
        ATMMoney = ATMMoney.subtract(getMoney("31", new BigDecimal(200), new BigDecimal(222)));
        if (n.test(ATMMoney)) {
            errorState = INSUFFICIENT_FUNDS_ATM;
        }
        errorState = NON;
        return BigDecimal.valueOf(1);
    }


}
