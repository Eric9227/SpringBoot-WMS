package com.Warehouse.service;


import com.Warehouse.pojo.Goods;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/3
 * 商品表（Goods）数据处理层
 * @author ericzhao
 */
@Service
public interface GoodsService {
    /**
     * 查询所有数据
     * @return  返回所有数据
     */
    public List<Goods> selectGoods();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public List<Goods> selectGoodsById(Integer id);
    /**
     * 新增数据
     *
     * @param goods 实例对象
     */
    public Boolean insertGoods(Goods goods);
    /**
     * 修改数据
     *
     * @param goods 实例对象
     * @return 执行结果
     */
    public Boolean updateGoodsById(Goods goods);
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    public int deleteGoodsById(Integer id);
}
