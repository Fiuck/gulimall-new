package top.lemcoo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.Query;

import top.lemcoo.gulimall.product.dao.QrtzJobDetailsDao;
import top.lemcoo.gulimall.product.entity.QrtzJobDetailsEntity;
import top.lemcoo.gulimall.product.service.QrtzJobDetailsService;


@Service("qrtzJobDetailsService")
public class QrtzJobDetailsServiceImpl extends ServiceImpl<QrtzJobDetailsDao, QrtzJobDetailsEntity> implements QrtzJobDetailsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzJobDetailsEntity> page = this.page(
                new Query<QrtzJobDetailsEntity>().getPage(params),
                new QueryWrapper<QrtzJobDetailsEntity>()
        );

        return new PageUtils(page);
    }

}