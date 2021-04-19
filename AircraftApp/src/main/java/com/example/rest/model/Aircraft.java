package com.example.rest.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
//@Setter
//@Getter
@Data //getters and setters, hashcode and equals, toString
public class Aircraft {
	
	public Aircraft(int andIncrement, String string, String string2, int i, int j, int k, int l) {
		// TODO Auto-generated constructor stub
	}

	private int aircraftId;
	private String aircraftName;
	private String description;
	
	private int crusingRange;
	private int maxRange;
	private int minRange;
	private int aircraftFleet;
	
	private List<Pilot> pilots = new ArrayList<Pilot>();
	
	

}
