package com.oguzhan.services;

import com.oguzhan.dto.DtoAddress;

public interface IAddressService {

	public DtoAddress findAddressById(Long id);
}
