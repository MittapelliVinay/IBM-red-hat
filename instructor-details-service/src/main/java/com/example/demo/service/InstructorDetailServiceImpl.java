package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDao;
import com.example.demo.dao.InstructorDetailDao;
import com.example.demo.instructor.Instructor;
import com.example.demo.instructor.InstructorDetail;
@Service
public class EntityDetailServiceImpl implements InstructorDetailService{
	
	private InstructorDetailDao instructorDetailDao;
	private InstructorDao instructorDao;
	public EntityDetailServiceImpl(InstructorDetailDao instructorDetailDao, InstructorDao instructorDao) {
		this.instructorDetailDao = instructorDetailDao;
		this.instructorDao = instructorDao;
	}



	@Override
	public InstructorDetail createInstructorDetails(InstructorDetail instructorDetail) {
		
		Instructor i= instructorDao.save(instructorDetail.getInstructor());
		instructorDetail.setInstructor(i);

		return instructorDetailDao.save(instructorDetail);
	}

}