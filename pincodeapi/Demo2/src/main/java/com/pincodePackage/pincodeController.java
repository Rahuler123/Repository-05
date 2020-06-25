package com.pincodePackage;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pincode")
	public class pincodeController {
		private final pincodeService pincodeService;
		
		@Autowired
		public pincodeController(pincodeService pincodeService) {
			this.pincodeService = pincodeService;
		}
/*
		@GetMapping
		public ResponseEntity<List<pincode>> findAll() {
			return ResponseEntity.ok(pincodeService.findAll());
		}
*/
		@GetMapping("/{pincode}")
		public ResponseEntity <pincode> findById(@PathVariable Integer pincode){
			 return ResponseEntity.ok(pincodeService.findByPincode(pincode).get());
			 
		}

}
