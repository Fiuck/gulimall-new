package top.lemcoo.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.lemcoo.gulimall.product.entity.QrtzSchedulerStateEntity;
import top.lemcoo.gulimall.product.service.QrtzSchedulerStateService;
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
@RequestMapping("product/qrtzschedulerstate")
public class QrtzSchedulerStateController {
    @Autowired
    private QrtzSchedulerStateService qrtzSchedulerStateService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzSchedulerStateService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    public R info(@PathVariable("schedName") String schedName){
		QrtzSchedulerStateEntity qrtzSchedulerState = qrtzSchedulerStateService.getById(schedName);

        return R.ok().put("qrtzSchedulerState", qrtzSchedulerState);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QrtzSchedulerStateEntity qrtzSchedulerState){
		qrtzSchedulerStateService.save(qrtzSchedulerState);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QrtzSchedulerStateEntity qrtzSchedulerState){
		qrtzSchedulerStateService.updateById(qrtzSchedulerState);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzSchedulerStateService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
