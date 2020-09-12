package com.partha.ArchiveRxService.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partha.ArchiveRxService.models.PatRx;
import com.partha.ArchiveRxService.service.RxService;

@RestController
@RequestMapping("/rx")
public class RxResource {

	@Autowired
	RxService RxService;
	
	@PostMapping("/save")
	public void saveRx(@RequestBody PatRx rx)
	{
		/*PatRx rx = new PatRx();
		rx = ObjectCreator.getRx();*/
		System.out.println(rx);
		RxService.saveRx(rx);
	}
	
	@GetMapping("/getAllRx")
	public List<PatRx> getAllRx()
	{
		List<PatRx> rxs = new ArrayList<PatRx>();
		rxs = RxService.getAllRx();
		return rxs;
	}
	
}
