package com.mendi_perlov.covid19.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mendi_perlov.covid19.DAO.HospitalDAO;
import com.mendi_perlov.covid19.DAO.TestedDAO;
import com.mendi_perlov.covid19.models.Hospital;
import com.mendi_perlov.covid19.models.Tested;
import com.mendi_perlov.covid19.utils.DateService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	 @Autowired
	private HospitalDAO dao;
	 @Autowired
		DateService date;
		
	 
	 @PostMapping("addHospital")
		public ResponseEntity<String> createHospital(@RequestBody List<Hospital> hospitals) {
			System.out.println("************** "+hospitals.toString()+" *****************");
			for (Hospital h : hospitals) {
				Date date=this.date.GenerateCurrentDate();
				h.setTimeDate(date);
			}
				dao.saveAll(hospitals);
			
			return new ResponseEntity<String>(hospitals.toString(), HttpStatus.OK);
		}
		@GetMapping()
		public List<Hospital> getStatistics() {
			
			return (List<Hospital>) dao.findAll();
		}

}
