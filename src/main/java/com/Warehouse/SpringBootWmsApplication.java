package com.Warehouse;

import com.Warehouse.Config.SwaggerConfig;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@MapperScan("com.Warehouse.dao")
@Slf4j
@Import(SwaggerConfig.class)
public class SpringBootWmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWmsApplication.class, args);
        log.info("仓库管理系统启动成功！");
    }

}
