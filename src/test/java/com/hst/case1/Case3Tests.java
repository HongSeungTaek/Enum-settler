package com.hst.case1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hst.case3.PayGroup;
import com.hst.config.BeanClass;

@SpringBootTest(classes = {BeanClass.class})
class Case3Tests {

	@Test
	void contextLoads() {
		String payCode = selectPayCode();
		PayGroup payGroup = PayGroup.findByPayCode(payCode);
		
		System.out.println("case3");
		System.out.println(payGroup.name());
		System.out.println(payGroup.getTitle());
	}

	
	private String selectPayCode() {
		return "PAYCO";
	} 
}
