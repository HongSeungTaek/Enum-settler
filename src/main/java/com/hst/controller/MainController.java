package com.hst.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hst.case5.EnumMapperValue;
import com.hst.case5.FeeType;

@RestController
public class MainController {

	@RequestMapping("/")
	@ResponseBody
	public List<EnumMapperValue> getNoBeanCategories() {
		return Arrays.stream(FeeType.values())
				.map(EnumMapperValue::new)
				.collect(Collectors.toList());
	}
}
