package io.niceseason.gulimall.coupon.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;

import io.niceseason.common.utils.PageUtils;
import io.niceseason.gulimall.coupon.entity.CouponSpuRelationEntity;

/**
 * 优惠券与产品关联
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 20:03:33
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

