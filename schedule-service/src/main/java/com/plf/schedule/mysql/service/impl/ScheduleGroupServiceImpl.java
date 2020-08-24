package com.plf.schedule.mysql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.plf.schedule.db.mysql.mapper.ScheduleGroupMapper;
import com.plf.schedule.model.ScheduleGroup;
import com.plf.schedule.mysql.service.ScheduleGroupService;

@Service
public class ScheduleGroupServiceImpl implements ScheduleGroupService{

	@Autowired
	private ScheduleGroupMapper scheduleGroupMapper;
	
	@Override
	public PageInfo<ScheduleGroup> findByName(Integer pageNum,Integer pageSize,String groupName) {
		PageHelper.startPage(pageNum, pageSize);
		List<ScheduleGroup> list = scheduleGroupMapper.findByName(groupName);
		return PageInfo.of(list);
	}

}
