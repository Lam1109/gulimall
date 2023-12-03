package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lam
 * @email 1031941624@qq.com
 * @date 2023-11-26 15:39:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
