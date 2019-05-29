package com.tektutorial.spring.cloud.contract.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraudDetectionController {

    @GetMapping("/fraudcheck")
    public String isNumberPrime(@RequestParam("loanAmount") Integer number) {
        return number > 9999 ? "{\n" +
                "    \"fraudCheckStatus\": \"FRAUD\",\n" +
                "    \"rejectionReason\": \"Amount too high\"\n" +
                "  }" :
                "{\n" +
                "    \"fraudCheckStatus\": \"Not-Fraud\",\n" +
                "    \"rejectionReason\": \"Amount OK\"\n" +
                "  }";
    }

}
