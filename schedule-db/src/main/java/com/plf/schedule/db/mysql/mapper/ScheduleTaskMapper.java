package com.plf.schedule.db.mysql.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.plf.schedule.model.ScheduleTask;

@Repository
@Mapper
public interface ScheduleTaskMapper {
	public List<ScheduleTask> findByTaskName(String taskName);
}
