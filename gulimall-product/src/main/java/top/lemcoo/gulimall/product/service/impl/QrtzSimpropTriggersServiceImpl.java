package top.lemcoo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.Query;

import top.lemcoo.gulimall.product.dao.QrtzSimpropTriggersDao;
import top.lemcoo.gulimall.product.entity.QrtzSimpropTriggersEntity;
import top.lemcoo.gulimall.product.service.QrtzSimpropTriggersService;


@Service("qrtzSimpropTriggersService")
public class QrtzSimpropTriggersServiceImpl extends ServiceImpl<QrtzSimpropTriggersDao, QrtzSimpropTriggersEntity> implements QrtzSimpropTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzSimpropTriggersEntity> page = this.page(
                new Query<QrtzSimpropTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzSimpropTriggersEntity>()
        );

        return new PageUtils(page);
    }

}