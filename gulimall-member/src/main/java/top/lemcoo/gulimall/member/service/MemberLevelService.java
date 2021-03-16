package top.lemcoo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-16 18:16:28
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

