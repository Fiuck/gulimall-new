package top.lemcoo.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-16 18:19:44
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

