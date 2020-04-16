package com.example.gpspringboot;

import com.example.gpspringboot.mybatismapper.entity.Country;
import com.example.gpspringboot.mybatismapper.mapper.CountryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)//运行在spring环境中
@SpringBootTest
public class SampleTest {

//    @Resource
//    private UserMapper userMapper;

    @Resource
    private CountryMapper countryMapper;

    @Test
    public void testSelect() {
         //利用mybatis-plus来简化增删改查
        //打开@org.mybatis.spring.annotation.MapperScan("com.example.gpspringboot.mybatisplus.mapper")注解
//        System.out.println(("----- selectAll userMapper test  Start------"));
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
//        System.out.println(("----- selectAll userMapper test END------"));

        //利用mybtis Mapper来简化增删改查
//        System.out.println(("----- selectAll countryMapper test  Start------"));
//        List<Country> countries = countryMapper.selectAll();
//        countries.stream().forEach(System.out::println);
//        System.out.println(("----- selectAll countryMapper test  Start------"));
//
//        //使用纯接口注解方式时
//        Country country = countryMapper.selectByCountryName("北京");
//        System.out.println(country);
        Country country = new Country();
        country.setCountrycode("300");
        country.setCountryname("澳门");
        int insert = countryMapper.insert(country);
        System.out.println(insert);
    }
}