package com.mendi_perlov.covid19.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mendi_perlov.covid19.DAO.StatisticDAO;
import com.mendi_perlov.covid19.DAO.TestedDAO;
import com.mendi_perlov.covid19.models.Statistic;
import com.mendi_perlov.covid19.models.Tested;
import com.mendi_perlov.covid19.utils.DateService;

import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/statistic")
public class StatisticController {
	@Autowired
	private StatisticDAO dao;
	@Autowired
	private TestedDAO testedDAO;
	@Autowired
	DateService date;
	
	
//	@PostMapping("createStatistic")
//	public List createStatistics(@RequestBody List<Statistic>statistics) {
//			dao.saveAll(statistics);
//		
//		return statistics;
//	}
	
//	@PostMapping("createStatistic")
//	public ResponseEntity<String> createStatistics(@RequestBody List<Statistic> statistics) {
////		Statistic statistic2=new Statistic();
//		
////		statistic2.getCity()
//		System.out.println("************** "+statistics.toString()+" *****************");
//		for (Statistic statistic : statistics) {
//			Date date=this.date.GenerateCurrentDate();
//			statistic.setTimeDate(date);
//		}
//			dao.saveAll(statistics);
//		
//		return new ResponseEntity<String>(statistics.toString(), HttpStatus.OK);
//	}

	@GetMapping("getStatistic")
	public ResponseEntity<String> getStatistics() {
		List<Statistic> statistics=dao.findAll();
		for (Statistic statistic : statistics) {
			System.out.println(	statistic.getTimeDate().getDate());
			System.out.println(new Date(System.currentTimeMillis()));
		}
		return new ResponseEntity<String>(statistics.toString(), HttpStatus.OK) ;
	}
	public void createStatistic() {
		List<Tested>testedList=testedDAO.findAll();
		for (Tested tested : testedList) {
			System.out.println(	tested.getTimeDate());
		}
	}
	
	
	
}
