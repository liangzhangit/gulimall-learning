package io.niceseason.gulimall.coupon.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;

import io.niceseason.common.utils.PageUtils;
import io.niceseason.gulimall.coupon.entity.CouponEntity;

/**
 * 优惠券信息
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 20:03:33
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

