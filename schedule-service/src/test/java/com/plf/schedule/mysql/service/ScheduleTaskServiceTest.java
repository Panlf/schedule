package com.plf.schedule.mysql.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.github.pagehelper.PageInfo;
import com.plf.schedule.ScheduleServiceApplication;
import com.plf.schedule.model.ScheduleTask;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest(classes=ScheduleServiceApplication.class)
@ExtendWith(SpringExtension.class)
@Slf4j
public class ScheduleTaskServiceTest {
	
	@Autowired
	private ScheduleTaskService scheduleTaskService;
	
	@Test
	public void findByTaskNameTest() {
		PageInfo<ScheduleTask> pageInfo = scheduleTaskService.findByTaskName(1, 10, null);
		log.info("获取到数据为{}",pageInfo);
	}
}
