package com.plf.schedule.model;

import java.util.Date;

import lombok.Data;

/**
 * 定时任务分组
 * @author panlf
 *
 */
@Data
public class ScheduleGroup {

	/**
	 * 主键id
	 */
	private Integer id;
	
	/**
	 * 任务组名
	 */
	private String groupName;
	
	/**
	 * 创建时间
	 */
	private Date createtime;
	
	/**
	 * 删除标志
	 */
	private Integer flag;
}
