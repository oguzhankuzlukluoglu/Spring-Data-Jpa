package com.oguzhan.services;

import com.oguzhan.dto.DtoHome;

public interface IHomeService {

	public DtoHome findHomeById(Long id);
}
