package top.lemcoo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.Query;

import top.lemcoo.gulimall.product.dao.QrtzBlobTriggersDao;
import top.lemcoo.gulimall.product.entity.QrtzBlobTriggersEntity;
import top.lemcoo.gulimall.product.service.QrtzBlobTriggersService;


@Service("qrtzBlobTriggersService")
public class QrtzBlobTriggersServiceImpl extends ServiceImpl<QrtzBlobTriggersDao, QrtzBlobTriggersEntity> implements QrtzBlobTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzBlobTriggersEntity> page = this.page(
                new Query<QrtzBlobTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzBlobTriggersEntity>()
        );

        return new PageUtils(page);
    }

}