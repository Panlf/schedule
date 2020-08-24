package com.plf.schedule.mysql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.plf.schedule.db.mysql.mapper.ScheduleTaskMapper;
import com.plf.schedule.model.ScheduleTask;
import com.plf.schedule.mysql.service.ScheduleTaskService;

@Service
public class ScheduleTaskServiceImpl implements ScheduleTaskService {

	@Autowired
	private ScheduleTaskMapper scheduleTaskMapper;
	
	@Override
	public PageInfo<ScheduleTask> findByTaskName(Integer pageNum, Integer pageSize, String taskName) {
		PageHelper.startPage(pageNum, pageSize);
		List<ScheduleTask> list = scheduleTaskMapper.findByTaskName(taskName);
		return PageInfo.of(list);
	}

}
