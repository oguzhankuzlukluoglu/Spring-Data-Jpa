package com.oguzhan.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oguzhan.dto.DtoAddress;
import com.oguzhan.dto.DtoCustomer;
import com.oguzhan.entites.Address;
import com.oguzhan.repository.AddressRepository;
import com.oguzhan.services.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public DtoAddress findAddressById(Long id) {
		DtoAddress dtoAddress = new DtoAddress();
		Optional<Address> optional= addressRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		Address address = optional.get();
		BeanUtils.copyProperties(address, dtoAddress);
		
		DtoCustomer dtoCustomer = new DtoCustomer();
		dtoCustomer.setId(address.getCustomer().getId());
		dtoCustomer.setName(address.getCustomer().getName());
		
//		dtoCustomer.setAddress(dtoAddress);
		
		dtoAddress.setCustomer(dtoCustomer);
		return dtoAddress;
	}

	
}
