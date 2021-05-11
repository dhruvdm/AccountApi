package com.xbank.accountapi.model;

public enum AccountTypes {
    CURRENT("Current"),
    SAVING("Saving");

    String value;

    private AccountTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
