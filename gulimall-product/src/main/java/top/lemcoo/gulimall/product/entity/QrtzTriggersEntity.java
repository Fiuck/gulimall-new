package top.lemcoo.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-14 16:17:51
 */
@Data
@TableName("QRTZ_TRIGGERS")
public class QrtzTriggersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String schedName;
	/**
	 * 
	 */
	private String triggerName;
	/**
	 * 
	 */
	private String triggerGroup;
	/**
	 * 
	 */
	private String jobName;
	/**
	 * 
	 */
	private String jobGroup;
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private Long nextFireTime;
	/**
	 * 
	 */
	private Long prevFireTime;
	/**
	 * 
	 */
	private Integer priority;
	/**
	 * 
	 */
	private String triggerState;
	/**
	 * 
	 */
	private String triggerType;
	/**
	 * 
	 */
	private Long startTime;
	/**
	 * 
	 */
	private Long endTime;
	/**
	 * 
	 */
	private String calendarName;
	/**
	 * 
	 */
	private Integer misfireInstr;
	/**
	 * 
	 */
	private Blob jobData;

}
