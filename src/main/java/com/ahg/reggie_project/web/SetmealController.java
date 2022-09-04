package com.ahg.reggie_project.web;


/*
 套餐管理的请求
 */

import com.ahg.reggie_project.common.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/setmeal")
public class SetmealController {

    @PostMapping()
    public R add(){

        return R.error("添加套餐失败");
    }
}
