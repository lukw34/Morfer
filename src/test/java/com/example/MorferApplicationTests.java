package com.example;


import com.example.morpheus.MorferService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MorferApplicationTests {

	@Autowired
	MorferService morferService;

	@Test
	public void contextLoads() {
		Assert.assertEquals("Content should load", 1,1);
	}


}
