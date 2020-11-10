package com.mendi_perlov.covid19.models;



import java.time.LocalDate;
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
@Document(collection = "tested")
public class Tested {
	@Id
	private String id;
	private String city;
	private String gender;
	private int age;
	private LocalDate timeDate;
	private boolean positive;
	private String status;	
	private String date;
}
