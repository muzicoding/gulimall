package com.hsiaopeng.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsiaopeng.common.utils.PageUtils;
import com.hsiaopeng.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author hsiaopenglee
 * @email 982512804@qq.com
 * @date 2024-05-16 10:29:03
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

