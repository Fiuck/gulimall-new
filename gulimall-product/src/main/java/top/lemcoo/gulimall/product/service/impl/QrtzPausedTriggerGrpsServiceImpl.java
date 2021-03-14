package top.lemcoo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.Query;

import top.lemcoo.gulimall.product.dao.QrtzPausedTriggerGrpsDao;
import top.lemcoo.gulimall.product.entity.QrtzPausedTriggerGrpsEntity;
import top.lemcoo.gulimall.product.service.QrtzPausedTriggerGrpsService;


@Service("qrtzPausedTriggerGrpsService")
public class QrtzPausedTriggerGrpsServiceImpl extends ServiceImpl<QrtzPausedTriggerGrpsDao, QrtzPausedTriggerGrpsEntity> implements QrtzPausedTriggerGrpsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzPausedTriggerGrpsEntity> page = this.page(
                new Query<QrtzPausedTriggerGrpsEntity>().getPage(params),
                new QueryWrapper<QrtzPausedTriggerGrpsEntity>()
        );

        return new PageUtils(page);
    }

}