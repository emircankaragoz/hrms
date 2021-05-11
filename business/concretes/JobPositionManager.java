package kodlamaio.hrms.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService{

	
	JobPositionDao jobPositionDao;
	
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPosiitonDao) {
		super();
		this.jobPositionDao = jobPosiitonDao;
	}



	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}
	
}
