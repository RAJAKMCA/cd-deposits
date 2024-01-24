package com.abybank.cdeposits.service;

import com.abybank.cdeposits.entity.CdRates;
import com.abybank.cdeposits.model.CdHistoryRatesDTO;
import com.abybank.cdeposits.model.CdManagerHistoryRatesDTO;
import com.abybank.cdeposits.model.CdManagerRatesDTO;
import com.abybank.cdeposits.model.CdRatesDTO;

import java.util.List;

public interface CdRateServices {
    public List<CdRatesDTO> getData(int zipCode);

    List<CdManagerRatesDTO> getManagerData(int zipCode);

    List<CdHistoryRatesDTO> getHistoryData(int zipCode);

    List<CdManagerHistoryRatesDTO> getManagerHistoryData(int zipCode);

    List<CdHistoryRatesDTO> getCustomerHistoryData(int zipCode);

    List<CdRatesDTO> getCustomerData(int zipCode);
}
