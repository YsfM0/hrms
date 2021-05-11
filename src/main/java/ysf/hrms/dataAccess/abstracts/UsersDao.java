package ysf.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ysf.hrms.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users,Integer>{

}
