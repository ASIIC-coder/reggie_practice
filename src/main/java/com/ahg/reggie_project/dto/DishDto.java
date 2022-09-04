package com.ahg.reggie_project.dto;

import com.ahg.reggie_project.bean.Dish;
import com.ahg.reggie_project.bean.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
