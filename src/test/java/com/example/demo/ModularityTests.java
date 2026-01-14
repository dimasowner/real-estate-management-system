package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModularityTests {

    @Test
    void verifyModularity() {
        ApplicationModules.of(RealEstateSalesApplication.class).verify();
    }
}
