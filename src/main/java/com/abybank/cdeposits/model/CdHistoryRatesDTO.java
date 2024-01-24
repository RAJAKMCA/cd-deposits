package com.abybank.cdeposits.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CdHistoryRatesDTO {

	private String termLength;
	private Double interestRate;
	private Integer minDepositOpen;
	private Integer maxDepositPermit;


	@Override
	public String toString() {
		return "CdHistoryRatesDTO [termLength=" + termLength + ", interestRate=" + interestRate
				+ ", minDepositOpen=" + minDepositOpen + ", maxDepositPermit=" + maxDepositPermit + "]";
	}
}