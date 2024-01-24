package com.abybank.cdeposits.repository;

import com.abybank.cdeposits.entity.CdRates;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CdRatesRepository extends CassandraRepository<CdRates, String>{

}