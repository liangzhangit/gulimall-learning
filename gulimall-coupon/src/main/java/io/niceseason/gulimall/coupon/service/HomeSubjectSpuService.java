package io.niceseason.gulimall.coupon.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;

import io.niceseason.common.utils.PageUtils;
import io.niceseason.gulimall.coupon.entity.HomeSubjectSpuEntity;

/**
 * 专题商品
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 20:03:33
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

