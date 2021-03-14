package top.lemcoo.gulimall.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lemcoo.gulimall.product.dao.BrandDao;
import top.lemcoo.gulimall.product.entity.BrandEntity;
import top.lemcoo.gulimall.product.service.BrandService;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandDao brandDao;

    @Test
    void testInsert() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("这是一个手机品牌！");
        brandEntity.setShowStatus(1);
        brandEntity.setFirstLetter("H");
        int insert = brandDao.insert(brandEntity);
    }
    @Test
    public void testQuery() throws Exception{
        List<BrandEntity> brandEntities = brandDao.selectList(null);
        System.out.println(brandEntities);
    }

}
