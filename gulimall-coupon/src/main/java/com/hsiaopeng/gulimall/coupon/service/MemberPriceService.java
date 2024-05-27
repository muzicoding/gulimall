package com.hsiaopeng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsiaopeng.common.utils.PageUtils;
import com.hsiaopeng.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author hsiaopenglee
 * @email 982512804@qq.com
 * @date 2024-05-16 14:36:56
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

