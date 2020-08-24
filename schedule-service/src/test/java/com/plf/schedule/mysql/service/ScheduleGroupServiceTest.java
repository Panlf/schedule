package com.plf.schedule.mysql.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.github.pagehelper.PageInfo;
import com.plf.schedule.ScheduleServiceApplication;
import com.plf.schedule.model.ScheduleGroup;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest(classes=ScheduleServiceApplication.class)
@ExtendWith(SpringExtension.class)
@Slf4j
public class ScheduleGroupServiceTest {
	
	@Autowired
	private ScheduleGroupService scheduleGroupService;
	
	@Test
	public void findByNameTest() {
		PageInfo<ScheduleGroup> pageInfo = scheduleGroupService.findByName(1, 10, null);
		log.info("获取到数据为{}",pageInfo);
	}
}
