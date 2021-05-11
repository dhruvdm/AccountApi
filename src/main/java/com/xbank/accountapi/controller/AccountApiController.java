package com.xbank.accountapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xbank.accountapi.model.rest.AccountResponse;
import com.xbank.accountapi.model.rest.AccountTypeRequest;
import com.xbank.accountapi.model.rest.GetAccountByCustomerId;
import com.xbank.accountapi.service.AccountService;

@RestController
@RequestMapping("/customer")
public class AccountApiController {

    @Autowired
    AccountService accountService;

    @PostMapping("/accounts")
    public List<AccountResponse> getAccounts(@RequestBody GetAccountByCustomerId requestObject) {

        return accountService.getAccounts(requestObject.getCustomerId());
    }

    @PostMapping("/account/type")
    public String getAccountType(@RequestBody AccountTypeRequest requestObject) {

        return accountService.getAccountType(requestObject.getAccountNumber());
    }

    /*
     * Dummy endpoint. Created to test the application with data. This will populate dummy data in the repo
     */
    @GetMapping("/account/createData")
    public void createDummyData() {

        accountService.populateDummyData();

    }
}
