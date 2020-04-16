package com.isea533.mybatis.mapper;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.RowBoundsMapper;

@tk.mybatis.mapper.annotation.RegisterMapper
public abstract class MyMapper<T> implements BaseMapper<T>,ExampleMapper<T>,RowBoundsMapper<T>,Marker {

}
