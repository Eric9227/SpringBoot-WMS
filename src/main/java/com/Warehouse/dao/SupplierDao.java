package com.Warehouse.dao;

import com.Warehouse.pojo.Supplier;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/5
 * @author ericzhao
 */
@Mapper
public interface SupplierDao extends BaseMapper<Supplier> {
}
