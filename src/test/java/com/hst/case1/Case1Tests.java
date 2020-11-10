package com.hst.case1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hst.config.BeanClass;

@SpringBootTest(classes = {BeanClass.class})
class Case1Tests {

	@Autowired
	private BeanClass beanClass;
	
	@Test
	void contextLoads() {
		TableStatus origin = selectFromOriginTable();
		
		String table1Value = origin.getTable1Value();
		boolean table2Value = origin.isTable2Value();
		System.out.println(table1Value);
		System.out.println(table2Value);
	}

	
	private TableStatus selectFromOriginTable() {
		return TableStatus.Y;
	} 
}
