package com.example.gpspringboot;

import com.example.gpspringboot.mybatismapper.entity.Country;
import com.example.gpspringboot.mybatismapper.mapper.CountryMapper;
import com.example.gpspringboot.mybatisplus.entity.User;
import com.example.gpspringboot.mybatisplus.mapper.UserMapper;
import com.example.gpspringboot.service.OrdersService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)//运行在spring环境中
@SpringBootTest
//@ContextConfiguration(locations = { "classpath*:beans.xml" })
public class SampleTest {

//    @Resource
//    private UserMapper userMapper;

//    @Resource
//    private CountryMapper countryMapper;

    @Autowired
    private OrdersService ordersService;


    @Test
    public void testSelect() {
         //利用mybatis-plus来简化增删改查
        //打开@org.mybatis.spring.annotation.MapperScan("com.example.gpspringboot.mybatisplus.mapper")注解
//        System.out.println(("----- selectAll userMapper test  Start------"));
//        List<User> userList = userMapper.select(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
//        System.out.println(("----- selectAll userMapper test END------"));

//
//        //利用mybtis Mapper来简化增删改查
//        System.out.println(("----- selectAll countryMapper test  Start------"));
//        Country country = new Country();
//        country.setId(1);
//        country.setCountrycode("xxxxx");
//        country.setCountryname("xxxxxxxxxx");
//        int i = countryMapper.updateByPrimaryKey(country);
//        System.out.println(i);
//        System.out.println(("----- selectAll countryMapper test  Start------"));


//        //使用纯接口注解方式时
//        Country country = countryMapper.selectByCountryName("北京");
//        System.out.println(country);


//        Country country = new Country();
//        country.setId(1);
//        country.setCountrycode("300");
//        country.setCountryname("澳门");
//        int insert = countryMapper.insert(country);
//        System.out.println(insert);

//        ordersService.accountMoney();
        ordersService.laoda();
    }
}