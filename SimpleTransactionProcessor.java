package com.swiftpay.ledger.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component // This tells Spring: "Manage this for me!"
public class SimpleTransactionProcessor implements TransactionProcessor {
    private double currentBalance;

    @PostConstruct
    public void setupInitialBalance() {
        // Simulating a "Starting Balance" for the app
        this.currentBalance = 1000.00;
        System.out.println(">> SwiftPay: 2. @PostConstruct (Opening Balance: ₦" + currentBalance + ")");
    }
    @PreDestroy
    public void closeVault() {
        System.out.println(">> SwiftPay: 3. @PreDestroy (Securing ₦" + currentBalance + " before shutdown)");
    }

    @Override
    public String Oke() {
        return "Oke Okorefe";
    }
    @Override
    public String getProcessDetails() {
        return "SwiftPay Ledger: Current balance:" + currentBalance;
    }

}