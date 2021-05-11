package com.xbank.accountapi.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xbank.accountapi.exceptions.AccountNotFoundException;
import com.xbank.accountapi.exceptions.NoAccountExistForCustomerIdException;
import com.xbank.accountapi.model.AccountTypes;
import com.xbank.accountapi.model.db.Account;
import com.xbank.accountapi.model.rest.AccountResponse;
import com.xbank.accountapi.repository.AccountRepository;

import util.DateUtil;
import util.ServiceUtil;

@Service
public class AccountService {

    @Autowired
    AccountRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(AccountService.class);

    public List<AccountResponse> getAccounts(String customerId) {

        List<Account> accounts = repository.findByCustomerId(customerId);

        if (accounts.isEmpty()) {
            logger.warn("No account found in DB for customerId - " + ServiceUtil.maskIt(customerId));
            throw new NoAccountExistForCustomerIdException();
        }

        List<AccountResponse> response = repository.findByCustomerId(customerId).stream()
            .map(o -> ServiceUtil.getResponseEntity(o))
            .collect(Collectors.toList());

        return response;

    }

    public String getAccountType(String accountNumber) {
        List<Account> accounts = repository.findByAccountNumber(accountNumber);
        if (accounts.isEmpty()) {
            logger.warn("No account found in DB for accountNumber - " + ServiceUtil.maskIt(accountNumber));
            throw new AccountNotFoundException();
        }
        return accounts.get(0).getAccountType().getValue();
    }

    public void populateDummyData() {
        repository.save(new Account("C0000000001", "11220000001", "Name1", AccountTypes.CURRENT,
            DateUtil.getDateFromString("2020-05-12T00:00:00.123+05:30"), "AUD", new BigDecimal(45600000)));

        repository.save(new Account("C0000000001", "11220000002", "Name2", AccountTypes.SAVING,
            DateUtil.getDateFromString("2020-05-13T00:00:00.123+05:30"), "AUD", new BigDecimal(45600000)));
    }
}
