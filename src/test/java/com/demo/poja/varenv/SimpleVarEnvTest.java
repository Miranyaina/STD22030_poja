package com.demo.poja.varenv;

import com.demo.poja.conf.FacadeIT;
import com.demo.poja.service.SecretService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SimpleVarEnvTest extends FacadeIT {
    @Autowired private SecretService subject;

    @Test
    public void test() {
        String expectedKey = "sk_preprod_test";
        String actualKey = subject.getSecretKey();
        Assertions.assertEquals(expectedKey, actualKey);
    }
}
