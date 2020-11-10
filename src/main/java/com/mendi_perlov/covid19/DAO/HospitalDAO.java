package com.mendi_perlov.covid19.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mendi_perlov.covid19.models.Hospital;

public interface HospitalDAO extends MongoRepository<Hospital, String> {

}
