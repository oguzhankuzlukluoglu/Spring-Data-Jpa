package com.oguzhan.services;

import java.util.List;

import com.oguzhan.dto.DtoEmployee;

public interface IEmployeeService {

	public List<DtoEmployee> findAllEmployees();
}
