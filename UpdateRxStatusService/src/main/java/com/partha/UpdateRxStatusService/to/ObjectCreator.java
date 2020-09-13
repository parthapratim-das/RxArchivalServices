package com.partha.UpdateRxStatusService.to;

import com.partha.UpdateRxStatusService.models.PatRx;
import com.partha.UpdateRxStatusService.models.Patient;
import com.partha.UpdateRxStatusService.models.Prescriber;

public class ObjectCreator {
	
	private static Patient patient;
	private static Prescriber prescriber;
	private static PatRx rx;
	
	public static Patient getSinglePatient()
	{
		patient = new Patient();
		patient.setPatId(100);
		patient.setPatFname("John");
		patient.setPatLname("Doe");
		patient.setPatAddress("123, Creek Row, Illinois");
		patient.setPatCountry("US");
		patient.setPatHomePhone("123-14325");
		patient.setPatSecondaryPhone("");
		return patient;
	}
	
	public static Prescriber getPrescriber()
	{
		prescriber = new Prescriber();
		prescriber.setPbrId(200);
		prescriber.setPbrFname("William");
		prescriber.setPbrLname("Francis");
		prescriber.setPbrRegno("USMC1234");
		prescriber.setPbrCountry("US");
		prescriber.setPbrPhone("159-65498");
		prescriber.setPbrAddress("9B, Middleton Square, Illinois");
		return prescriber;
	}
	
	public static PatRx getRx()
	{
		rx = new PatRx();
		rx.setRxId(5001);
		rx.setRxNum(56745398);
		rx.setPatient(getSinglePatient());
		rx.setPrescriber(getPrescriber());
		rx.setCreatedDate("9-12-2020");
		rx.setFillAuthorized(3);
		rx.setRxStatus("READY");
		return rx;
	}
	
	

}
