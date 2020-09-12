package com.partha.ArchiveRxService.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.partha.ArchiveRxService.dao.RxDao;
import com.partha.ArchiveRxService.models.PatRx;
import com.partha.ArchiveRxService.repo.RxRepository;

@Repository
public class RxDaoImpl implements RxDao{

	@Autowired
	private RxRepository rxRepo;
	@Override
	public void saveRx(PatRx rx) {

		rxRepo.save(rx);
		
	}

	@Override
	public List<PatRx> getAllRx() {
		return rxRepo.findAll();
	}

}
