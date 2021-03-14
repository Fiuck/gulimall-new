package top.lemcoo.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.lemcoo.gulimall.product.entity.QrtzSimpleTriggersEntity;
import top.lemcoo.gulimall.product.service.QrtzSimpleTriggersService;
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
@RequestMapping("product/qrtzsimpletriggers")
public class QrtzSimpleTriggersController {
    @Autowired
    private QrtzSimpleTriggersService qrtzSimpleTriggersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzSimpleTriggersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    public R info(@PathVariable("schedName") String schedName){
		QrtzSimpleTriggersEntity qrtzSimpleTriggers = qrtzSimpleTriggersService.getById(schedName);

        return R.ok().put("qrtzSimpleTriggers", qrtzSimpleTriggers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QrtzSimpleTriggersEntity qrtzSimpleTriggers){
		qrtzSimpleTriggersService.save(qrtzSimpleTriggers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QrtzSimpleTriggersEntity qrtzSimpleTriggers){
		qrtzSimpleTriggersService.updateById(qrtzSimpleTriggers);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzSimpleTriggersService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
