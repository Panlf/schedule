package com.plf.schedule.mysql.service;

import com.github.pagehelper.PageInfo;
import com.plf.schedule.model.ScheduleGroup;

public interface ScheduleGroupService {

	public PageInfo<ScheduleGroup> findByName(Integer pageNum,Integer pageSize,String groupName);
}
