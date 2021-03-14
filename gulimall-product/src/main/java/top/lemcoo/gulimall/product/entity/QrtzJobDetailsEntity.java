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
@TableName("QRTZ_JOB_DETAILS")
public class QrtzJobDetailsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String schedName;
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
	private String jobClassName;
	/**
	 * 
	 */
	private String isDurable;
	/**
	 * 
	 */
	private String isNonconcurrent;
	/**
	 * 
	 */
	private String isUpdateData;
	/**
	 * 
	 */
	private String requestsRecovery;
	/**
	 * 
	 */
	private Blob jobData;

}
