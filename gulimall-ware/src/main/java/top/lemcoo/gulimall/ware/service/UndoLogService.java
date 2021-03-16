package top.lemcoo.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-16 18:19:44
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

