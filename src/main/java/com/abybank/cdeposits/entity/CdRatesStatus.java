package com.abybank.cdeposits.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Table(name = "CD_RATES_STATUS")
public class CdRatesStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long amtCltd;
	private Long maa;
	private Long totalCDs;
	private Long ads;
	private Date startDate;
	private Date endDate;
	private String createdBy;
	private String updatedBy;

	public CdRatesStatus(Long id, Long amtCltd, Long maa, Long totalCDs, Long ads, Date startDate, Date endDate, String createdBy, String updatedBy) {
		this.id = id;
		this.amtCltd = amtCltd;
		this.maa = maa;
		this.totalCDs = totalCDs;
		this.ads = ads;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "CdRatesStatus [id=" + id + ", amtCltd=" + amtCltd + ", maa=" + maa + ", totalCDs=" + totalCDs + ", ads="
				+ ads + ", startDate=" + startDate + ", endDate=" + endDate + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + "]";
	}

}
