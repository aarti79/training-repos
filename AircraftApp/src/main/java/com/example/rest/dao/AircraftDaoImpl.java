package com.example.rest.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.example.rest.model.Aircraft;
import com.example.rest.model.Pilot;

public class AircraftDaoImpl implements IAircraftDao{
	
	private static AtomicInteger aircraftId = new AtomicInteger(10000);
	private static AtomicInteger pilotId = new AtomicInteger(100);
	private static List<Aircraft> dummyDb = loadData();
	
	private static List<Aircraft> loadData() {
		List<Aircraft> aircrafts = new ArrayList<Aircraft>();
		
		Aircraft aircraft = new Aircraft(aircraftId.getAndIncrement(),"AS-213","TATA",12445,12500,1200,345);
		Aircraft aircraft1 = new Aircraft(aircraftId.getAndIncrement(),"BIS-213","TATA",12445,12500,1200,345);
		Aircraft aircraft2 = new Aircraft(aircraftId.getAndIncrement(),"KML-213","TATA",12445,12500,1200,345);
		
		Pilot aarti = new Pilot(pilotId.getAndIncrement(),"Aarti",LocalDate.of(2000, 11,23),"NOrth America", "3453553","arti@gmail.com");
		Pilot asha = new Pilot(pilotId.getAndIncrement(),"Asha",LocalDate.of(1998, 1,2),"NOrth America", "3453553","arti@gmail.com");
		Pilot pooja = new Pilot(pilotId.getAndIncrement(),"Pooja",LocalDate.of(1999, 2,23),"NOrth America", "3453553","arti@gmail.com");
		
		aircrafts.add(aircraft2);aircrafts.add(aircraft1);aircrafts.add(aircraft);
		return aircrafts;
		
	}
	
	@Override
	public List<Aircraft> getAllAircrafts() {
		return dummyDb;
	}
	

}
