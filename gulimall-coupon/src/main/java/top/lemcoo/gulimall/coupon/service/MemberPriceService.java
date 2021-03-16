package top.lemcoo.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-16 18:21:41
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

