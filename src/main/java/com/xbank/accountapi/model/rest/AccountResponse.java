package com.xbank.accountapi.model.rest;

import java.math.BigDecimal;

public class AccountResponse {

    String customerId;

    String accountNumber;

    String accountName;

    String accountType;

    String balanceDate;

    String currencyCode;

    BigDecimal balanceAmount;

    public AccountResponse() {
        super();
    }

    public AccountResponse(String customerId, String accountNumber, String accountName, String accountType,
        String balanceDate, String currencyCode, BigDecimal balanceAmount) {
        super();
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balanceDate = balanceDate;
        this.currencyCode = currencyCode;
        this.balanceAmount = balanceAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(String balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BigDecimal balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    @Override
    public String toString() {
        return "AccountResponse [customerId=" + customerId + ", accountNumber=" + accountNumber + ", accountName="
            + accountName + ", accountType=" + accountType + ", balanceDate=" + balanceDate + ", currencyCode="
            + currencyCode + ", balanceAmount=" + balanceAmount + "]";
    }

}
