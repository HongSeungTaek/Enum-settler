package com.hst.case1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hst.case2.CalculatorType;
import com.hst.config.BeanClass;

@SpringBootTest(classes = {BeanClass.class})
class Case2Tests {

	@Test
	void contextLoads() {
		CalculatorType code = selectCode();
		
		long originValue = 10000L;
		long result = code.calculate(originValue);
		System.out.println("case2");
		System.out.println(result);
	}

	
	private CalculatorType selectCode() {
		return CalculatorType.CALC_B;
	} 
}
