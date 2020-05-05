package com.learning.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.learning.entities.Report;
import com.learning.entities.Tag;

@Service
@Transactional
public class TestServiceImpl implements ITestService {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void save() {
		Report report = new Report();
		report.setName("Report 1");

		Tag t1 = new Tag();
		t1.setName("Tag1");
		Tag t2 = new Tag();
		t2.setName("Tag2");

		report.addTag(t1);
		report.addTag(t2);

		entityManager.persist(report);

	}

}
