package com.abybank.cdeposits.entity;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import jakarta.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table
public class ArchiveCdRates {

	@PrimaryKey
	private String id;
	private String termLength;
	private Double interestRate;
	private Double managerRate;
	private Double APY;
	private Integer minDeposit;
	private Integer maxDeposit;
	private Date startDate;
	private Date endDate;
	private String createdBy;
	private String updatedBy;

	public ArchiveCdRates(String id, String termLength, Double interestRate, Double managerRate, Double APY, Integer minDeposit, Integer maxDeposit, Date startDate, Date endDate, String createdBy, String updatedBy) {
		this.id = id;
		this.termLength = termLength;
		this.interestRate = interestRate;
		this.managerRate = managerRate;
		this.APY = APY;
		this.minDeposit = minDeposit;
		this.maxDeposit = maxDeposit;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "CdHistoryRates [id=" + id + ", termLength=" + termLength + ", interestRate=" + interestRate
				+ ", managerRate=" + managerRate + ", APY=" + APY + ", mindo=" + minDeposit + ", maxdp=" + maxDeposit
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", createdBy=" + createdBy + ", updatedBy="
				+ updatedBy + "]";
	}
}
