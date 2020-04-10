package com.example.gpspringboot.mybatismapper.mapper;

import com.example.gpspringboot.mybatismapper.entity.MySelectProvider;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.annotation.RegisterMapper;

import java.util.List;

@RegisterMapper
public interface   SelectAllMapper<T> {
    /**
     * 查询全部结果
     *
     * @return
     */
    @SelectProvider(type = MySelectProvider.class, method = "dynamicSQL")
    List<T> selectAll();
}
