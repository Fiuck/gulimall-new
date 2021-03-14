package top.lemcoo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.Query;

import top.lemcoo.gulimall.product.dao.QrtzCronTriggersDao;
import top.lemcoo.gulimall.product.entity.QrtzCronTriggersEntity;
import top.lemcoo.gulimall.product.service.QrtzCronTriggersService;


@Service("qrtzCronTriggersService")
public class QrtzCronTriggersServiceImpl extends ServiceImpl<QrtzCronTriggersDao, QrtzCronTriggersEntity> implements QrtzCronTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzCronTriggersEntity> page = this.page(
                new Query<QrtzCronTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzCronTriggersEntity>()
        );

        return new PageUtils(page);
    }

}