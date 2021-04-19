package com.example.rest.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data //getters and setters, hashcode and equals, toString
public class Pilot {
	
	public Pilot(int andIncrement, String string, LocalDate of, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	private int pilotId;
	private String pilotName;
	private LocalDate dateOfJoining;
	private String address;
	private String contactno;
	private String emailId;
	
	private List<Aircraft> aircrafts = new ArrayList<>();

}
