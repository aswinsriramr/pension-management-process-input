package com.pension.processpensioninput.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="pensioner-detail",url="http://localhost:9002/pensionerdetail",configuration = {FeignConfig.class})
public interface PensionerDetailsProxy {
	
	@GetMapping("/{aadharNumber}")
	public ResponseEntity<?> getPensionerDetailsByAadhar(@PathVariable("aadharNumber") String aadharNumber);
}
