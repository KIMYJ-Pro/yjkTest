package com.yjk.kpay.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	// 레스트 컨트롤러 어노테이션
public class kpayContorollerTest {
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello()
	{
		return "<h1>hello spring boot </h1>";
	}

}
