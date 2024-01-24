package com.abybank.cdeposits.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CdManagerHistoryRatesDTO {

	private String termLength;
	private Double managerHistoryIntrstRate;
	private Integer minDepositOpen;
	private Integer maxDepositPermit;

	public CdManagerHistoryRatesDTO(String termLength, Double managerHistoryIntrstRate, Integer minDepositOpen, Integer maxDepositPermit) {
		this.termLength = termLength;
		this.managerHistoryIntrstRate = managerHistoryIntrstRate;
		this.minDepositOpen = minDepositOpen;
		this.maxDepositPermit = maxDepositPermit;
	}

	@Override
	public String toString() {
		return "CdManagerHistoryRatesDTO [termLength=" + termLength + ", managerHistoryIntrstRate="
				+ managerHistoryIntrstRate + ", minDepositOpen=" + minDepositOpen + ", maxDepositPermit="
				+ maxDepositPermit + "]";
	}
}