package com.partha.ArchiveRxService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.partha.ArchiveRxService.models.PatRx;

public interface RxRepository extends MongoRepository<PatRx, Integer>{

}
