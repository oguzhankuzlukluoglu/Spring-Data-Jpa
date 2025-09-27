package com.oguzhan.services;

import com.oguzhan.dto.DtoCustomer;

public interface ICustomerService {

	public DtoCustomer findCustomerById(Long id);
}
