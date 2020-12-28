package com.github.Rasen0000;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.math.BigDecimal;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@Slf4j

class ClientTest {


    private static Validator validator;

    @BeforeAll
    public static void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
        log.info("Ошибка");
    }
    @Test
    void getMoney() {
        Client client = new Client("P@$", new BigDecimal(2000), new BigDecimal(15));

        Set<ConstraintViolation<Client>> constraintViolations = validator.validate( client );
        assertEquals( 1, constraintViolations.size());
        assertEquals( "Пароль должен состоять из 6-8 символов", constraintViolations.iterator().next().getMessage());


    }


    @Test
    void getCash() {
        Client client = new Client("P@$", new BigDecimal(2000), new BigDecimal(15));
        assertNull(client.getCash());
    }
}

