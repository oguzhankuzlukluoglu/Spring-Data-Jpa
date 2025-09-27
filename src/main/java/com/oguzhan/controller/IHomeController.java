package com.oguzhan.controller;

import com.oguzhan.dto.DtoHome;

public interface IHomeController {

	public DtoHome findHomeById(Long id);
}
