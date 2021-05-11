package com.xbank.accountapi.model.rest;

import javax.validation.constraints.NotNull;

public class AccountTypeRequest {

    @NotNull
    String accountNumber;

    public AccountTypeRequest() {
        super();
    }

    public AccountTypeRequest(String accountNumber) {
        super();
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
