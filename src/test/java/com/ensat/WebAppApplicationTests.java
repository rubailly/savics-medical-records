package com.ensat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.savics.medicalrecords.SavicsMedicalRecordsApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SavicsMedicalRecordsApplication.class)
@WebAppConfiguration
public class WebAppApplicationTests {

	@Test
	public void contextLoads() {
	}

}
