package top.lemcoo.gulimall.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lemcoo.gulimall.common.utils.R;
import top.lemcoo.gulimall.member.dao.MemberDao;
import top.lemcoo.gulimall.member.entity.MemberEntity;
import top.lemcoo.gulimall.member.feign.CouponFeignService;

import java.util.List;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    MemberDao memberDao;

    @Test
    void contextLoads() {
        List<MemberEntity> memberEntities = memberDao.selectList(null);
        System.out.println(memberEntities);
    }

}
