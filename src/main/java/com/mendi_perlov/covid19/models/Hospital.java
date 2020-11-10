package com.mendi_perlov.covid19.models;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection  = "hospital")
public class Hospital {
	@Id
	private String id;
	private String hospitalName;
	private Date timeDate ;
	private String generalOccupancy;
	private String covidOccupancy;
	private int isolatedStaff;	
}
