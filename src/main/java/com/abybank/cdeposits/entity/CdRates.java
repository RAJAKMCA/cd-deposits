package com.abybank.cdeposits.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Table
public class CdRates {


	@PrimaryKey
	private String id;
	private String termLength;
	private Double interestRate;
	private Double managerRate;
	private Double annualPercenYield;
	private Integer minDepositToOpen;
	private Integer maxDepositPermitted;
	private Integer penaltyDays;
	private Double penaltyPercentage;
	private String cdType;
	private String status;
	private Date startDate;
	private Date endDate;
	private String createdBy;
	private String updatedBy;
	private String stateCode;

	public CdRates(String id, String termLength, Double interestRate, Double managerRate, Double annualPercenYield, Integer minDepositToOpen, Integer maxDepositPermitted, Integer penaltyDays, Double penaltyPercentage, String cdType, String status, Date startDate, Date endDate, String createdBy, String updatedBy, String stateCode) {
		this.id = id;
		this.termLength = termLength;
		this.interestRate = interestRate;
		this.managerRate = managerRate;
		this.annualPercenYield = annualPercenYield;
		this.minDepositToOpen = minDepositToOpen;
		this.maxDepositPermitted = maxDepositPermitted;
		this.penaltyDays = penaltyDays;
		this.penaltyPercentage = penaltyPercentage;
		this.cdType = cdType;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "CdRates [id=" + id + ", termLength=" + termLength + ", interestRate=" + interestRate + ", managerRate="
				+ managerRate + ", annualPercenYield=" + annualPercenYield + ", minDepositToOpen="
				+ minDepositToOpen + ", maxDepositPermitted=" + maxDepositPermitted + ", penaltyDays=" + penaltyDays
				+ ", penaltyPercentage=" + penaltyPercentage + ", cdType=" + cdType + ", status=" + status + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", stateCode=" + stateCode + "]";
	}
}
