package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lam
 * @email 1031941624@qq.com
 * @date 2023-12-03 15:25:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
