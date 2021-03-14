package top.lemcoo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.Query;

import top.lemcoo.gulimall.product.dao.QrtzSimpleTriggersDao;
import top.lemcoo.gulimall.product.entity.QrtzSimpleTriggersEntity;
import top.lemcoo.gulimall.product.service.QrtzSimpleTriggersService;


@Service("qrtzSimpleTriggersService")
public class QrtzSimpleTriggersServiceImpl extends ServiceImpl<QrtzSimpleTriggersDao, QrtzSimpleTriggersEntity> implements QrtzSimpleTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzSimpleTriggersEntity> page = this.page(
                new Query<QrtzSimpleTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzSimpleTriggersEntity>()
        );

        return new PageUtils(page);
    }

}