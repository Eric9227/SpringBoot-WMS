package com.Warehouse;

import com.Warehouse.dao.SupplierDao;
import com.Warehouse.pojo.Goods;
import com.Warehouse.pojo.Supplier;
import com.Warehouse.pojo.User;
import com.Warehouse.service.GoodsService;
import com.Warehouse.service.UserLoginService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootWmsApplicationTests {
    @Autowired
    UserLoginService userLoginService;
    @Autowired
    GoodsService goodsService;
    //登录模块测试
    @Test
    void contextLoads() {
        List<User> users = userLoginService.loginUsers();
        users.forEach(a-> System.out.println(a));
    }
    @Test
    public void testContext(){
        List<Goods> goods = goodsService.selectGoodsById(1);
        goods.forEach(a-> System.out.println(a));
        List<Goods> goods1 = goodsService.selectGoods();
        System.out.println(goods1);
    }
@Autowired
    SupplierDao supplierDao;
    @Test
    public void mptest(){
        List<Supplier> suppliers = supplierDao.selectList(null);
        System.out.println(suppliers);
    }

}
