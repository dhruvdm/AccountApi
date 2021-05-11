package com.xbank.accountapi.model.db;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xbank.accountapi.model.AccountTypes;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column
    String customerId;

    @Column
    String accountNumber;

    @Column
    String accountName;

    @Enumerated(EnumType.STRING)
    AccountTypes accountType;

    @Column
    ZonedDateTime balanceDate;

    @Column
    String currencyCode;

    @Column
    BigDecimal balanceAmount;

    public Account() {
    }

    public Account(String customerId, String accountNumber, String accountName, AccountTypes accountType,
        ZonedDateTime balanceDate,
        String currencyCode, BigDecimal balanceAmount) {
        super();
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balanceDate = balanceDate;
        this.currencyCode = currencyCode;
        this.balanceAmount = balanceAmount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public AccountTypes getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypes accountType) {
        this.accountType = accountType;
    }

    public ZonedDateTime getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(ZonedDateTime balanceDate) {
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
        return "Account [id=" + id + ", customerId=" + customerId + ", accountNumber=" + accountNumber
            + ", accountName=" + accountName
            + ", accountType=" + accountType + ", balanceDate=" + balanceDate + ", currencyCode=" + currencyCode
            + ", balanceAmount=" + balanceAmount + "]";
    }


}
