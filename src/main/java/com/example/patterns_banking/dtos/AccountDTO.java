package com.example.patterns_banking.dtos;

import com.example.patterns_banking.models.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
    private String number;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    private BigDecimal balance;
    private Boolean isActive = true;
}
