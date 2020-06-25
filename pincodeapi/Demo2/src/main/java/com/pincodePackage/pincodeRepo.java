package com.pincodePackage;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pincodeRepo extends JpaRepository<pincode, Integer> {

	Optional<pincode> findByPincode(Integer pincode);
	
}
