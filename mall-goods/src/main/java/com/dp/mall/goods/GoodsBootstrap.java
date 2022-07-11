package com.dp.mall.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author HePeng
 */
@SpringBootApplication
public class GoodsBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(GoodsBootstrap.class, args);
    }
}
