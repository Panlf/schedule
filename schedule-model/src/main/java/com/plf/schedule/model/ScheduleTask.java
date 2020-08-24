package com.plf.schedule.model;

import java.util.Date;

import lombok.Data;

/**
 * 定时任务的Model
 * @author panlf
 *
 */
@Data
public class ScheduleTask {

	/**
	 * 主键id
	 */
	private String id;
	
	/**
	 * 任务表达式
	 */
	private String cron;
	
	/**
	 * 任务全类名
	 */
	private String clazz;
	
	/**
	 * 任务组ID
	 */
	private Integer groupId;
	
	/**
	 * 任务名称
	 */
	private String groupName;
	
	/**
	 * 任务名称
	 */
	private String taskName;
	
	/**
	 * 创建时间
	 */
	private Date createtime;
	
	/**
	 * 删除标识 0 存在 1 已删除
	 */
	private Integer flag;
}
