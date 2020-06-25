package com.pincodePackage;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class pincodeService {
	
	private final pincodeRepo pincodeRepo;
	
	
	@Autowired
	public pincodeService (pincodeRepo pincodeRepo ) {
		this.pincodeRepo = pincodeRepo;
		
	}
	public List<pincode> findAll(){
		return pincodeRepo.findAll();
	}
	
	
	public Optional <pincode> findByPincode(Integer pincode){
		return pincodeRepo.findByPincode(pincode);
		
	}

}
