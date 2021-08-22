package com.savics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.savics.medicalrecords.SavicsMedicalRecordsApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest (classes = SavicsMedicalRecordsApplication.class)
@WebAppConfiguration
public class WebAppApplicationTests {

	@Test
	public void contextLoads() {
	}

}
