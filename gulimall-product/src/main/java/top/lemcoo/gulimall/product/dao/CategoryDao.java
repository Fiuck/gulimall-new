package top.lemcoo.gulimall.product.dao;

import top.lemcoo.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-14 22:35:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
