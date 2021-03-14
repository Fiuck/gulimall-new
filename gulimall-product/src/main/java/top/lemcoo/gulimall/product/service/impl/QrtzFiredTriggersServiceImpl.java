package top.lemcoo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.Query;

import top.lemcoo.gulimall.product.dao.QrtzFiredTriggersDao;
import top.lemcoo.gulimall.product.entity.QrtzFiredTriggersEntity;
import top.lemcoo.gulimall.product.service.QrtzFiredTriggersService;


@Service("qrtzFiredTriggersService")
public class QrtzFiredTriggersServiceImpl extends ServiceImpl<QrtzFiredTriggersDao, QrtzFiredTriggersEntity> implements QrtzFiredTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzFiredTriggersEntity> page = this.page(
                new Query<QrtzFiredTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzFiredTriggersEntity>()
        );

        return new PageUtils(page);
    }

}