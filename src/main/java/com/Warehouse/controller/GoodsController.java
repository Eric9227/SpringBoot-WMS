package com.Warehouse.controller;


import com.Warehouse.pojo.Goods;
import com.Warehouse.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/3
 */
@Slf4j
@RequestMapping("/wms/goods")
@RestController
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @GetMapping
    public Result selectGoodsall() {
        List<Goods> goods = goodsService.selectGoods();
        Integer code = goods.isEmpty() ? Code.GET_ERROR : Code.GET_OK;
        return new Result(goods, code);
    }
    @GetMapping("/{id}")
    public Result selectGoodsbyId(@PathVariable Integer id){
        List<Goods> goods = goodsService.selectGoodsById(id);
        Integer code = goods.isEmpty() ? Code.GET_ERROR : Code.GET_OK;
        return new Result(goods,code);
    }
    @PutMapping
    public Result updateGoods(@RequestBody Goods goods){
        Boolean aBoolean = goodsService.updateGoodsById(goods);
        Integer code = aBoolean ? Code.GET_OK : Code.GET_ERROR;
        return new Result(aBoolean,code);
    }
    @PostMapping
    public Result insertGoods(@RequestBody Goods goods){
        Boolean aBoolean = goodsService.insertGoods(goods);
        Integer code = aBoolean ? Code.PUT_OK : Code.PUT_ERROR;
        return  new Result(aBoolean,code);
    }
//    @DeleteMapping("/#{id}")
    public Result deleteGoods(@PathVariable Integer id){
        int i = goodsService.deleteGoodsById(id);
        Integer code = i!=0 ? Code.DELETE_OK : Code.DELETE_ERROR;
        return new Result(i,code);
    }

}
