package com.demo.poja.endpoint;

import com.demo.poja.service.SecretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VarEnvTestController {
    @Autowired private SecretService secretService;

    @GetMapping("/env")
    public String test() {
        return secretService.getSecretKey();
    }
}
