package io.niceseason.gulimall.coupon.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import io.niceseason.gulimall.coupon.entity.CouponEntity;

/**
 * 优惠券信息
 * 
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 20:03:33
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
