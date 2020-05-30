package com.example.gpspringboot.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrdersDao {
    // 注入jdbcTemplate模板对象
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 对数据操作的方法不包含业务操作
    /**
     * 小王少钱的方法
     */
    public void reduceMoney() {
        String sql = "update account set salary=salary-? where username=?";
        int i = jdbcTemplate.update(sql, 1000, "小王");
        System.out.println(i);
    }

    /**
     * 小马多钱的方法
     */
    public void addMoney() {
        String sql = "update account set salary=salary+? where username=?";
        jdbcTemplate.update(sql,1000,"小马");
    }

    public void select(){
        String sql = "select * from account";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println(maps);
    }
}
