package top.lemcoo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.Query;

import top.lemcoo.gulimall.product.dao.SysUserTokenDao;
import top.lemcoo.gulimall.product.entity.SysUserTokenEntity;
import top.lemcoo.gulimall.product.service.SysUserTokenService;


@Service("sysUserTokenService")
public class SysUserTokenServiceImpl extends ServiceImpl<SysUserTokenDao, SysUserTokenEntity> implements SysUserTokenService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysUserTokenEntity> page = this.page(
                new Query<SysUserTokenEntity>().getPage(params),
                new QueryWrapper<SysUserTokenEntity>()
        );

        return new PageUtils(page);
    }

}