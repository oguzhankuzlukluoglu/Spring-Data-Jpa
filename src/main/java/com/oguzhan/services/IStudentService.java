package com.oguzhan.services;

import java.util.List;

import com.oguzhan.dto.DtoStudent;
import com.oguzhan.dto.DtoStudentIU;
import com.oguzhan.entites.Student;

public interface IStudentService {

	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id , DtoStudentIU dtoStudentIU);
	
}
