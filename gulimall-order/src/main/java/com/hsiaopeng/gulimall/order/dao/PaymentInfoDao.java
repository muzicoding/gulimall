package com.hsiaopeng.gulimall.order.dao;

import com.hsiaopeng.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author hsiaopenglee
 * @email 982512804@qq.com
 * @date 2024-05-16 15:05:04
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
