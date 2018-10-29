package com.gaochaojin.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 16:02 2018/10/29
 */
@Repository
public class TestDao {

    private String flag = "1";

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "TestDao{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
