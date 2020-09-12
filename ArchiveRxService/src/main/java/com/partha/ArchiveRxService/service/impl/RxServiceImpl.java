package com.partha.ArchiveRxService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.partha.ArchiveRxService.dao.RxDao;
import com.partha.ArchiveRxService.models.PatRx;
import com.partha.ArchiveRxService.service.RxService;

@Service
public class RxServiceImpl implements RxService{
	
	@Autowired
	RxDao rxDao;

	@Override
	public void saveRx(PatRx rx) {

		rxDao.saveRx(rx);
	}

	@Override
	public List<PatRx> getAllRx() {
		return rxDao.getAllRx();
	}
	
	

}
