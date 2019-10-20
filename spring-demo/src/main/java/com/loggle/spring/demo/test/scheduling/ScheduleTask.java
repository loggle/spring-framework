package com.loggle.spring.demo.test.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

	@Scheduled(cron = "0/5 * * * * ?")
	public void test() {
		System.out.println("-------------------");
	}
}
