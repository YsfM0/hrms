package ysf.hrms.business.concretes;

import java.util.List;
import ysf.hrms.business.abstracts.JobNamesService;
import ysf.hrms.dataAccess.abstracts.JobNamesDao;
import ysf.hrms.entities.concretes.jobNames;

public class JobNamesManager implements JobNamesService {
	
	private JobNamesDao jobNamesDao;

	public JobNamesManager(JobNamesDao jobNamesDao) {
		super();
		this.jobNamesDao = jobNamesDao;
	}

	@Override
	public List<jobNames> getAll() {
		return this.jobNamesDao.findAll();
		
	}

}
