package com.example.gpspringboot.mybatismapper.mapper;


import com.example.gpspringboot.mybatismapper.entity.Country;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface  CountryMapper extends Mapper<Country> {

    @Select("select * from country where countryname = #{countryname}")
    Country selectByCountryName(String countryname);
}
