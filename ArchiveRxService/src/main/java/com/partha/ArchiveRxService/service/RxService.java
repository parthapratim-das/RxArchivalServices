package com.partha.ArchiveRxService.service;

import java.util.List;

import com.partha.ArchiveRxService.models.PatRx;

public interface RxService {
	
	public void saveRx(PatRx rx);
	public List<PatRx> getAllRx();

}
