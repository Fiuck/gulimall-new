package top.lemcoo.gulimall.ware.dao;

import top.lemcoo.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-16 18:19:44
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
