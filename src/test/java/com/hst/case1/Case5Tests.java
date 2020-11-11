package com.hst.case1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.hst.config.BeanClass;
import com.hst.controller.MainController;


@AutoConfigureMockMvc
@ContextConfiguration(classes = {MainController.class})
@SpringBootTest(classes = {BeanClass.class})
class Case5Tests {

    @Autowired
    private MockMvc mockMvc;
    
    /**
     * Rest API 호출시 데이터가 정상적으로 나오지만
     * JUnit으로 테스트 시 Exception 발생
     * */
	@Test
	void contextLoads() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
		         .andExpect(MockMvcResultMatchers.status().isOk())
		         .andDo(MockMvcResultHandlers.print());
		
	}
}
