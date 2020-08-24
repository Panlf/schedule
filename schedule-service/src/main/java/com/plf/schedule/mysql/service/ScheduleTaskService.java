package com.plf.schedule.mysql.service;

import com.github.pagehelper.PageInfo;
import com.plf.schedule.model.ScheduleTask;

public interface ScheduleTaskService {

	public PageInfo<ScheduleTask> findByTaskName(Integer pageNum,Integer pageSize,String taskName);
}
