package top.lemcoo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.Query;

import top.lemcoo.gulimall.product.dao.QrtzTriggersDao;
import top.lemcoo.gulimall.product.entity.QrtzTriggersEntity;
import top.lemcoo.gulimall.product.service.QrtzTriggersService;


@Service("qrtzTriggersService")
public class QrtzTriggersServiceImpl extends ServiceImpl<QrtzTriggersDao, QrtzTriggersEntity> implements QrtzTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzTriggersEntity> page = this.page(
                new Query<QrtzTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzTriggersEntity>()
        );

        return new PageUtils(page);
    }

}