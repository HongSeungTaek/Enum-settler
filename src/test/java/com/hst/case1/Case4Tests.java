package com.hst.case1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hst.case3.PayGroup;
import com.hst.case4.PayGroupAdvanced;
import com.hst.case4.PayType;
import com.hst.config.BeanClass;

@SpringBootTest(classes = {BeanClass.class})
class Case4Tests {

	@Test
	void contextLoads() {
		PayType payType = selectPayType();
		PayGroupAdvanced payGroupAdvanced = PayGroupAdvanced.findByPayType(payType);
		
		System.out.println("case4");
		System.out.println(payGroupAdvanced.name());
		System.out.println(payGroupAdvanced.getTitle());
	}

	
	private PayType selectPayType() {
		return PayType.REMITTANCE;
	} 
}
