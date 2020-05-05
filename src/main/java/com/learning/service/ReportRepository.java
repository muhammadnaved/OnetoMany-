package com.learning.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entities.Report;

public interface ReportRepository extends JpaRepository<Report, Long>{

}
