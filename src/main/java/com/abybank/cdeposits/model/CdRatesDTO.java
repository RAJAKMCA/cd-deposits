package com.abybank.cdeposits.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CdRatesDTO {
    private String termLength;
    private Double interestRate;
    private Integer minDepositOpen;
    private Integer maxDepositPermit;

    public CdRatesDTO(String termLength, Double interestRate, Integer minDepositOpen, Integer maxDepositPermit) {
        this.termLength = termLength;
        this.interestRate = interestRate;
        this.minDepositOpen = minDepositOpen;
        this.maxDepositPermit = maxDepositPermit;
    }
}
