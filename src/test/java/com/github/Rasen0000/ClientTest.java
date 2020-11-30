package com.github.Rasen0000;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;

    {
        client = new Client("P@$$word", new BigDecimal(2000), new BigDecimal(15));
    }

    @Test
    void getCash() {
        assertNull(client.getCash());
    }
}