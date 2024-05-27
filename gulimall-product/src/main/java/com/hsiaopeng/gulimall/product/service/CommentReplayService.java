package com.hsiaopeng.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsiaopeng.common.utils.PageUtils;
import com.hsiaopeng.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author hsiaopenglee
 * @email 982512804@qq.com
 * @date 2024-05-16 10:29:03
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

