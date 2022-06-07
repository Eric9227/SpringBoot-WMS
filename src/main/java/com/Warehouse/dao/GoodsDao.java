package com.Warehouse.dao;


import com.Warehouse.pojo.Goods;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/3
 * 商品表（Goods）数据访问层
 * @author ericzhao
 * @since 2022-6-3
 */
public interface GoodsDao {
    /**
     * 查询所有数据
     * @return  返回所有数据
     */
    @Select("select *from wms_goods")
    public List<Goods> selectGoods();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Select("select *from wms_goods where goods_id = #{id}")
    public List<Goods> selectGoodsById(Integer id);
    /**
     * 新增数据
     *
     * @param goods 实例对象
     */
    @Insert("INSERT INTO wms_goods values (null,#{goodsName},#{goodsCategory},#{goodsProduction},#{goodsExpire},#{supplierId},#{goodsQuantity})")
    public Boolean insertGoods(Goods goods);
    /**
     * 修改数据
     *
     * @param goods 实例对象
     * @return 执行结果
     */
    @Update("update wms_goods set goods_name=#{goodsName},goods_category=#{goodsCategory},goods_production=#{goodsProduction},goods_expire=#{goodsExpire},supplier_id=#{supplierId},goods_quantity=#{goodsQuantity} where goods_id=#{goodsId}")
    public Boolean updateGoodsById(Goods goods);
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    @Delete("delete from wms_goods where goods_id=#{goodsId}")
    public int deleteGoodsById(Integer id);

}
