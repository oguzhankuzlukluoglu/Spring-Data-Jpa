package com.oguzhan.controller;

import java.util.List;

import com.oguzhan.dto.DtoEmployee;

public interface IEmployeeController {

	public List<DtoEmployee> findAllEmployees();
}
