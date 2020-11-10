package com.mendi_perlov.covid19.models;



import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

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
@Document(collection = "statistic")
public class Statistic {
	@Id
	private String id;
	private Date timeDate ;
	private String city;
	private int verified;
	private int active;
	private int respirators;	
	private int died;
	private int recovered;

}
