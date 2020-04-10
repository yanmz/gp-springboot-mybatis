package com.example.gpspringboot;

import com.example.gpspringboot.mybatismapper.entity.Country;
import com.example.gpspringboot.mybatismapper.mapper.CountryMapper;
import com.example.gpspringboot.mybatismapper.mapper.SelectAllMapper;
import com.example.gpspringboot.mybatisplus.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)//运行在spring环境中
@SpringBootTest
public class SampleTest {

//    @Resource
//    private UserMapper userMapper;

    @Resource
    private CountryMapper countryMapper;

    @Resource
    SelectAllMapper selectAllMapper;

    @Test
    public void testSelect() {
         //利用mybatis-plus来简化增删改查
//        System.out.println(("----- selectAll userMapper test  Start------"));
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
//        System.out.println(("----- selectAll userMapper test END------"));

        //利用mybtis Mapper来简化增删改查
        System.out.println(("----- selectAll countryMapper test  Start------"));
        List<Country> countries = countryMapper.selectAll();
        countries.stream().forEach(System.out::println);
        System.out.println(("----- selectAll countryMapper test  Start------"));

        //使用纯接口注解方式时
        Country country = countryMapper.selectByCountryName("北京");
        System.out.println(country);

        List list = selectAllMapper.selectAll();
        list.stream().forEach(System.out::println);


    }
}