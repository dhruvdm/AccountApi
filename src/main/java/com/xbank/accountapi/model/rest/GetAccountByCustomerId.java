package com.xbank.accountapi.model.rest;

public class GetAccountByCustomerId {

    String customerId;

    public GetAccountByCustomerId() {
        super();
    }

    public GetAccountByCustomerId(String customerId) {
        super();
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "customerId [customerId=" + customerId + "]";
    }

}
