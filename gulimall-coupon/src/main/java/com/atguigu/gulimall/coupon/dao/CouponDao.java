package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lam
 * @email 1031941624@qq.com
 * @date 2023-12-03 15:11:52
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
