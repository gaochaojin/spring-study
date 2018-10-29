package com.gaochaojin.controller;

import com.gaochaojin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 16:02 2018/10/29
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

}
