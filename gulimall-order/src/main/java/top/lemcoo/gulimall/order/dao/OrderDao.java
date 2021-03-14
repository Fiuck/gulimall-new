package top.lemcoo.gulimall.order.dao;

import top.lemcoo.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-14 16:39:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
