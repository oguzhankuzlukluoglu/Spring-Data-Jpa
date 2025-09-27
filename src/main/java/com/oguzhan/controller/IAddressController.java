package com.oguzhan.controller;

import com.oguzhan.dto.DtoAddress;

public interface IAddressController {

	public DtoAddress findAddressById(Long id);
}
