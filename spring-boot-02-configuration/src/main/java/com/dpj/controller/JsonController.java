package com.dpj.controller;

import com.dpj.config.FoodConfig;
import com.dpj.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController
 * 就是@Controller和@ResponseBody的组合
 * 功能是返回json形式的结果，而不是视图
 */
@RestController
@RequestMapping(produces = "application/json;charset=UTF-8")
public class JsonController {

    /**
     * Value（）
     * 通过${}结构来获得配置文件的属性值
     */
//    @Value("${food.rice}")
//    private String rice;
//
//    @Value("${food.meat}")
//    private String meat;

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json(){

        Food food = new Food(foodConfig.getRice(),foodConfig.getMeat());
        return food;
    }
}
