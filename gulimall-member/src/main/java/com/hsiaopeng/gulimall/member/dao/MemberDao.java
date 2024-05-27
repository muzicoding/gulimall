package com.hsiaopeng.gulimall.member.dao;

import com.hsiaopeng.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hsiaopenglee
 * @email 982512804@qq.com
 * @date 2024-05-16 14:43:26
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
