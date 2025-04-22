package com.example.patterns_banking.controllers;


import com.example.patterns_banking.dtos.AccountDTO;
import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.services.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    private AccountService accountService;

    public AccountController() {
        this.accountService = new AccountService();
    }

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody AccountDTO accountDTO) {
        Account account = accountService.create(accountDTO);
        return ResponseEntity.ok(account);
    }

}
