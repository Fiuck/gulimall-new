package top.lemcoo.gulimall.member.dao;

import top.lemcoo.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-16 18:16:28
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
