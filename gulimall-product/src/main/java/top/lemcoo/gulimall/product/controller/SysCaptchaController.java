package top.lemcoo.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.lemcoo.gulimall.product.entity.SysCaptchaEntity;
import top.lemcoo.gulimall.product.service.SysCaptchaService;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.R;



/**
 * 系统验证码
 *
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-14 16:17:51
 */
@RestController
@RequestMapping("product/syscaptcha")
public class SysCaptchaController {
    @Autowired
    private SysCaptchaService sysCaptchaService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysCaptchaService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
    public R info(@PathVariable("uuid") String uuid){
		SysCaptchaEntity sysCaptcha = sysCaptchaService.getById(uuid);

        return R.ok().put("sysCaptcha", sysCaptcha);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SysCaptchaEntity sysCaptcha){
		sysCaptchaService.save(sysCaptcha);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SysCaptchaEntity sysCaptcha){
		sysCaptchaService.updateById(sysCaptcha);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] uuids){
		sysCaptchaService.removeByIds(Arrays.asList(uuids));

        return R.ok();
    }

}
