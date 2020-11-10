/**
 * 
 */
package com.mendi_perlov.covid19.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mendi_perlov.covid19.DAO.TestedDAO;
import com.mendi_perlov.covid19.models.Statistic;
import com.mendi_perlov.covid19.models.Tested;
import com.mendi_perlov.covid19.utils.DateService;

/**
 * @author USER
 *
 */ @RestController
 @RequestMapping(path = "/tested")
public class testedController {
	 @Autowired
	private TestedDAO dao;
	 @Autowired
		DateService date;
		
	 
	 @PostMapping("addTested")
		public ResponseEntity<String> addTestedList(@RequestBody List<Tested> tested) {
			System.out.println("************** "+tested.toString()+" *****************");
			for (Tested t : tested) {
				t.setTimeDate(LocalDate.now());
			}
				dao.saveAll(tested);
			
			return new ResponseEntity<String>(tested.toString(), HttpStatus.OK);
		}
		@GetMapping()
		public List<Tested> getTestedList() {
			List<Tested> testedList=dao.findAll();
			for(Tested tested:testedList) { 
				
			 System.out.println(tested.getTimeDate().compareTo(LocalDate.now().minusDays(1)));
			 System.out.println(LocalDate.now());
		}
			return (List<Tested>) dao.findAll();
		}
		
}
