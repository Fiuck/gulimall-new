package top.lemcoo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.product.entity.QrtzSimpropTriggersEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-14 16:17:51
 */
public interface QrtzSimpropTriggersService extends IService<QrtzSimpropTriggersEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
