package com.Demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Democont {
	@RequestMapping("/get")
	public String show() {
		return "welcomr to amdocs";
	}

}
