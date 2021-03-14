package top.lemcoo.gulimall.product.dao;

import top.lemcoo.gulimall.product.entity.SysUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户
 * 
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-14 16:17:51
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
	
}
