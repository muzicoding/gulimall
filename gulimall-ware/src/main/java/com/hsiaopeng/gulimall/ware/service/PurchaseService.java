package com.hsiaopeng.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsiaopeng.common.utils.PageUtils;
import com.hsiaopeng.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author hsiaopenglee
 * @email 982512804@qq.com
 * @date 2024-05-16 15:10:11
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

