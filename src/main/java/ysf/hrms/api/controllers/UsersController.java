package ysf.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ysf.hrms.business.abstracts.UsersService;
import ysf.hrms.entities.concretes.Users;


@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UsersService usersService;
//	private JobNamesService jobNamesService;
	
//	@Autowired
//	public UsersController(JobNamesService jobNamesService) {
//		super();
//		this.jobNamesService = jobNamesService;
//	}


	@Autowired
	public UsersController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}


	@GetMapping("/getall")
	public List<Users> getAll(){
		return this.usersService.getAll();
	}
	
//	@GetMapping("/getallb")
//	public List<jobNames>getall(){
//		return this.jobNamesService.getAll();
//	}
	
	

}
