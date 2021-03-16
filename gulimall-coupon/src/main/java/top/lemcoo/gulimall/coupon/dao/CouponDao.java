package top.lemcoo.gulimall.coupon.dao;

import top.lemcoo.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-16 18:21:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
