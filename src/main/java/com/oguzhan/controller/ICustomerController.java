package com.oguzhan.controller;

import com.oguzhan.dto.DtoCustomer;

public interface ICustomerController {

	public DtoCustomer findCustomerById(Long id);
}
