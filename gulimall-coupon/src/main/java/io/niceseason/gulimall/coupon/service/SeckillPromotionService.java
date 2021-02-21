package io.niceseason.gulimall.coupon.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;

import io.niceseason.common.utils.PageUtils;
import io.niceseason.gulimall.coupon.entity.SeckillPromotionEntity;

/**
 * 秒杀活动
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 20:03:33
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

