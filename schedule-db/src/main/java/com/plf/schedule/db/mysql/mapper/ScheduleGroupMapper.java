package com.plf.schedule.db.mysql.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.plf.schedule.model.ScheduleGroup;

@Repository
@Mapper
public interface ScheduleGroupMapper {

	public List<ScheduleGroup> findByName(String groupName);
}
