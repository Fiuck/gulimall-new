package top.lemcoo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.Query;

import top.lemcoo.gulimall.product.dao.CategoryDao;
import top.lemcoo.gulimall.product.entity.CategoryEntity;
import top.lemcoo.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 获取所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 获取一级分类
        List<CategoryEntity> menuLevel = entities.stream().filter(entity ->
                entity.getParentCid() == 0
        ).map((entity) -> {
            entity.setChildrens(getChildren(entity, entities));
            return entity;
        }).sorted((entity1, entity2) -> {
            return (entity1.getSort() == null ? 0 : entity1.getSort()) - (entity2.getSort() == null ? 0 : entity2.getSort());
        }).collect(Collectors.toList());
        return menuLevel;
    }
    // 获取子分类
    public List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all){
        List<CategoryEntity> list = all.stream().filter(entity ->
                entity.getParentCid().equals(root.getCatId())
        ).map((entity) -> {
            entity.setChildrens(getChildren(entity, all));
            return entity;
        }).sorted((entity1, entity2) -> {
            return (entity1.getSort() == null ? 0 : entity1.getSort()) - (entity2.getSort() == null ? 0 : entity2.getSort());
        }).collect(Collectors.toList());
        return list;
    }

}