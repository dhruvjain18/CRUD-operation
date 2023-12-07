package com.example.springweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springweb.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String>{
	
}
