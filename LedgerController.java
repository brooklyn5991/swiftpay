package com.swiftpay.ledger.rest;

import com.swiftpay.ledger.common.TransactionProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LedgerController {

    private TransactionProcessor myProcessor;

    // Constructor Injection (Chad's favorite!)
    @Autowired
    public LedgerController(TransactionProcessor theProcessor) {
        myProcessor = theProcessor;
    }

    @GetMapping("/status")
    public String checkStatus() {
        return myProcessor.getProcessDetails();
    }
}