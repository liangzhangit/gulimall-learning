package io.niceseason.gulimall.coupon.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;

import io.niceseason.common.utils.PageUtils;
import io.niceseason.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;

/**
 * 优惠券分类关联
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 20:03:33
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

