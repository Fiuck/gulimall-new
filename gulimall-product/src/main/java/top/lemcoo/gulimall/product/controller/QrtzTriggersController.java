package top.lemcoo.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.lemcoo.gulimall.product.entity.QrtzTriggersEntity;
import top.lemcoo.gulimall.product.service.QrtzTriggersService;
import top.lemcoo.gulimall.common.utils.PageUtils;
import top.lemcoo.gulimall.common.utils.R;



/**
 * 
 *
 * @author zhaoweixu
 * @email zhaoweixu@gmail.com
 * @date 2021-03-14 16:17:51
 */
@RestController
@RequestMapping("product/qrtztriggers")
public class QrtzTriggersController {
    @Autowired
    private QrtzTriggersService qrtzTriggersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzTriggersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    public R info(@PathVariable("schedName") String schedName){
		QrtzTriggersEntity qrtzTriggers = qrtzTriggersService.getById(schedName);

        return R.ok().put("qrtzTriggers", qrtzTriggers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QrtzTriggersEntity qrtzTriggers){
		qrtzTriggersService.save(qrtzTriggers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QrtzTriggersEntity qrtzTriggers){
		qrtzTriggersService.updateById(qrtzTriggers);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzTriggersService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
