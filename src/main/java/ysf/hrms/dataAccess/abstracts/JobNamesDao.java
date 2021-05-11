package ysf.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ysf.hrms.entities.concretes.jobNames;

public interface JobNamesDao extends JpaRepository<jobNames, Integer>{

}
