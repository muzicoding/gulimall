package com.hsiaopeng.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsiaopeng.common.utils.PageUtils;
import com.hsiaopeng.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author hsiaopenglee
 * @email 982512804@qq.com
 * @date 2024-05-16 14:43:26
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

