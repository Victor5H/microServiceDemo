package com.example.demo;

import java.math.BigInteger;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	@GetMapping("/mul")
	public String mul(@RequestParam(name = "num1", defaultValue = "0") String num1,
			@RequestParam("num2") @DefaultValue(value = "0") String num2) {
		BigInteger n1, n2;
		n1 = new BigInteger(num1);
		n2 = new BigInteger(num2);
		BigInteger mul = n1.multiply(n2);
		return "{\"num1\":\"" + n1 + "\",\"num2\":\"" + n2 + "\",\"sum\":\"" + mul + "\"}";

	}
}
