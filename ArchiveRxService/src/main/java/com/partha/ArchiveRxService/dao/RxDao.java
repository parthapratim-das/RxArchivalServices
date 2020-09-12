package com.partha.ArchiveRxService.dao;

import java.util.List;

import com.partha.ArchiveRxService.models.PatRx;

public interface RxDao {

	public void saveRx(PatRx rx);
	public List<PatRx> getAllRx();
}
