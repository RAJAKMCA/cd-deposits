package com.abybank.cdeposits.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CdManagerRatesDTO {
	
	private String termLength;
	private Double managerIntrstRate;
	private Integer minDepositOpen;
	private Integer maxDepositPermit;

	public CdManagerRatesDTO(String termLength, Double managerIntrstRate, Integer minDepositOpen, Integer maxDepositPermit) {
		this.termLength = termLength;
		this.managerIntrstRate = managerIntrstRate;
		this.minDepositOpen = minDepositOpen;
		this.maxDepositPermit = maxDepositPermit;
	}

	@Override
	public String toString() {
		return "CdManagerRatesDTO [termLength=" + termLength + ", managerIntrstRate=" + managerIntrstRate
				+ ", minDepositOpen=" + minDepositOpen + ", maxDepositPermit=" + maxDepositPermit + "]";
	}

}