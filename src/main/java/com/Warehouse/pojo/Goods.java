package com.Warehouse.pojo;



import lombok.Data;

import java.util.Date;

@Data
public class Goods {
  private Integer goodsId;
  private String goodsName;
  private String goodsCategory;
  private Date goodsProduction;
  private Date goodsExpire;
  private Integer supplierId;
  private Integer goodsQuantity;


}
