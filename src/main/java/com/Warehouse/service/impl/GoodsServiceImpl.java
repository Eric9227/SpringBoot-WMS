package com.Warehouse.service.impl;


import com.Warehouse.dao.GoodsDao;
import com.Warehouse.pojo.Goods;
import com.Warehouse.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/3
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDao goodsDao;
    @Override
    public List<Goods> selectGoods() {
        return goodsDao.selectGoods();
    }

    @Override
    public List<Goods> selectGoodsById(Integer id) {
        return goodsDao.selectGoodsById(id);
    }

    @Override
    public Boolean insertGoods(Goods goods) {
        return goodsDao.insertGoods(goods);
    }

    @Override
    public Boolean updateGoodsById(Goods goods) {
        return goodsDao.updateGoodsById(goods);
    }

    @Override
    public int deleteGoodsById(Integer id) {
        return goodsDao.deleteGoodsById(id);
    }
}
