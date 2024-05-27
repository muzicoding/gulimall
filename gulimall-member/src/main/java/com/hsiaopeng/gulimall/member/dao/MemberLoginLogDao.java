package com.hsiaopeng.gulimall.member.dao;

import com.hsiaopeng.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author hsiaopenglee
 * @email 982512804@qq.com
 * @date 2024-05-16 14:43:26
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
