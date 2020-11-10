package com.mendi_perlov.covid19.DAO;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.CrudRepository;

import com.mendi_perlov.covid19.models.Statistic;

public interface StatisticDAO extends MongoRepository<Statistic, String>{

}
