package com.gaochaojin.service;

import com.gaochaojin.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 16:03 2018/10/29
 */
@Service
public class TestService {

    @Qualifier("testDao2")
    @Autowired(required=false)
//    @Resource  //1：不支持Primary功能；2：不支持Autowired false
//    @Inject //需要在pom.xml中引入javax.inject，和Autowired功能差不多，支持@Primary，只是没有Autowired false
    private TestDao testDao;

    public void println() {
        System.out.println("service===" + testDao);
    }


}
