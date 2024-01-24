package com.abybank.cdeposits.repository;

import com.abybank.cdeposits.entity.ArchiveCdRates;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CdArchiveRatesRepository extends CassandraRepository<ArchiveCdRates, String> {

}