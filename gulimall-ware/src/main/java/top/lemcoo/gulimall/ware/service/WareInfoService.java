package top.lemcoo.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-16 18:19:44
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

