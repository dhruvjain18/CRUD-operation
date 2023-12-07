package com.example.springweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springweb.bean.Subject;
import com.example.springweb.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository subjectrepo;
	
	public List<Subject> getAllSubjects(){
		List<Subject> subject = new ArrayList<>();
		subjectrepo.findAll().forEach(subject::add);
		return subject;
	}

	public void addSubject(Subject subject) {
		subjectrepo.save(subject);
	}

	public void updateSubject(String id, Subject subject) {
		subjectrepo.save(subject);
	}

	public void deleteSubject(String id) {
		subjectrepo.deleteById(id);
	}
}
