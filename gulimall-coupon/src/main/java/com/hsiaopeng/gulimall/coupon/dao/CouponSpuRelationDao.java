package com.hsiaopeng.gulimall.coupon.dao;

import com.hsiaopeng.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author hsiaopenglee
 * @email 982512804@qq.com
 * @date 2024-05-16 14:36:56
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
