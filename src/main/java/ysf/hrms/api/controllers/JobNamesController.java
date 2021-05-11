//package ysf.hrms.api.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import ysf.hrms.business.abstracts.JobNamesService;
//import ysf.hrms.entities.concretes.jobNames;
//
//@RestController
//@RequestMapping("/api/job")
//public class JobNamesController {
//
//	private JobNamesService jobNamesService;
//
//	@Autowired
//	public JobNamesController(JobNamesService jobNamesService) {
//		super();
//		this.jobNamesService = jobNamesService;
//	}
//	
//	@GetMapping("/getall")
//	public List<jobNames>getAll(){
//		return this.jobNamesService.getAll();
//	}
//
//}
