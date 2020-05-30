package com.example.gpspringboot.service;

import com.example.gpspringboot.dao.OrdersDao;
import com.example.gpspringboot.service.impl.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class OrdersService  implements OrdersServiceImpl {
    // 注入Dao层对象
    @Autowired
    private OrdersDao ordersDao;

    @Autowired
    OrdersService ordersService;

    // 注入TransactionTemplate对象
    @Autowired
    private TransactionTemplate transactionTemplate;

//    // 业务逻辑，写转账业务
//    @Override
//    public void accountMoney() {
//        // 小马多1000
//        ordersDao.addMoney();
//        // 加入出现异常如下面int
//        // i=10/0（银行中可能为突然停电等。。。）；结果：小马账户多了1000而小王账户没有少钱
//        // 解决办法是出现异常后进行事务回滚
//                    int i = 10 / 0;// 事务管理配置后异常已经解决
//        // 小王 少1000
//        ordersDao.reduceMoney();
//        ordersDao.select();
//    }

    /**
     * 编程式事务
     */
//    @Override
//    public void accountMoney() {
//        transactionTemplate.execute(new TransactionCallback<Object>() {
//            @Override
//            public Object doInTransaction(TransactionStatus status) {
//                Object result = null;
//                try {
//                    // 小马多1000
//                    ordersDao.addMoney();
//                    // 加入出现异常如下面int
//                    // i=10/0（银行中可能为突然停电等。。。）；结果：小马账户多了1000而小王账户没有少钱
//                    // 解决办法是出现异常后进行事务回滚
//                    int i = 10 / 0;// 事务管理配置后异常已经解决
//                    // 小王 少1000
//                    ordersDao.reduceMoney();
//                    ordersDao.select();
//                } catch (Exception e) {
//                    status.setRollbackOnly();
//                    result = false;
//                    System.out.println("Transfer Error!");
//                }
//                return result;
//            }
//        });
//    }

    /**
     * 注解事务编程
     */
    @Override
    public void accountMoney() {
        //小马多1000
        ordersDao.addMoney();
        // 加入出现异常如下面int
        // i=10/0（银行中可能为突然停电等。。。）；结果：小马账户多了1000而小王账户没有少钱
        // 解决办法是出现异常后进行事务回滚
//                    int i = 10 / 0;// 事务管理配置后异常已经解决
        // 小王 少1000
        ordersDao.reduceMoney();
        ordersDao.select();
    }

    /**
     * NEVER 以非事务方式运行，如果当前存在事务，则抛出异常。
     */
//    @Transactional(propagation= Propagation.REQUIRED)
//    public void laoda(){
//        System.out.println("老大的方法");
//        ordersDao.addMoney();
//        try {
//            ordersService.xiaodi();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        int x = 10;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }
//
//    @Transactional(propagation= Propagation.NEVER)
//    public void xiaodi(){
//        ordersDao.reduceMoney();
//        System.out.println("小弟的方法");
//        int x = 10;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }

    /**
     *NOT_SUPPORTED 以非事务方式运行，如果当前存在事务，则把当前事务挂起
     * 存在死锁
     */
//    @Transactional(propagation= Propagation.REQUIRED)
//    public void laoda(){
//        System.out.println("老大的方法");
//        ordersDao.addMoney();
//        try {
//            ordersService.xiaodi();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        int x = 10;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }
//
//    @Transactional(propagation= Propagation.NOT_SUPPORTED,timeout=2)
//    public void xiaodi(){
//        ordersDao.reduceMoney();
//        System.out.println("小弟的方法");
//        int x = 10;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }

    /**
     *SUPPORTS 如果当前存在事务，则加入该事务；如果当前没有事务，则以非事务的方式继续运行
     */
//    @Transactional(propagation= Propagation.REQUIRED)
//    public void laoda(){
//        System.out.println("老大的方法");
//        ordersDao.addMoney();
//        try {
//            ordersService.xiaodi();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        int x = 9;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }
//
//    @Transactional(propagation= Propagation.SUPPORTS)
//    public void xiaodi(){
//        ordersDao.reduceMoney();
//        System.out.println("小弟的方法");
//        int x = 10;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }

    /**
     *REQUIRES_NEW 创建一个新的事务，如果当前存在事务，则把当前事务挂起
     */
//    @Transactional(propagation= Propagation.REQUIRED)
//    public void laoda(){
//        System.out.println("老大的方法");
//        ordersDao.addMoney();
//        try {
//            ordersService.xiaodi();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        int x = 10;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }
//
//    @Transactional(propagation= Propagation.REQUIRES_NEW)
//    public void xiaodi(){
//        ordersDao.reduceMoney();
//        System.out.println("小弟的方法");
//        int x = 10;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }

    /**
     *NESTED 如果当前存在事务，则创建一个事务作为当前事务的嵌套事务来运行
     */
//    @Transactional(propagation= Propagation.REQUIRED)
//    public void laoda(){
//        System.out.println("老大的方法");
//        ordersDao.addMoney();
//        try {
//            ordersService.xiaodi();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        int x = 10;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }
//
//    @Transactional(propagation= Propagation.NESTED)
//    public void xiaodi(){
//        ordersDao.reduceMoney();
//        System.out.println("小弟的方法");
//        int x = 9;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }

    /**
     *REQUIRED 如果当前存在事务，则加入该事务；如果当前没有事务，则创建一个新的事务
     */
//    @Transactional(propagation= Propagation.REQUIRED)
//    public void laoda(){
//        System.out.println("老大的方法");
//        ordersDao.addMoney();
//        try {
//            ordersService.xiaodi();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        int x = 10;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }
//
//    @Transactional(propagation= Propagation.REQUIRED)
//    public void xiaodi(){
//        ordersDao.reduceMoney();
//        System.out.println("小弟的方法");
//        int x =9;
//        if(x==10){
//            throw  new RuntimeException("出错啦！");
//        }
//    }

    /**
     *MANDATORY 如果当前存在事务，则加入该事务；如果当前没有事务，则抛出异常
     */
//    @Transactional(propagation= Propagation.REQUIRED)
    public void laoda(){
        System.out.println("老大的方法");
        ordersDao.addMoney();
        try {
            ordersService.xiaodi();
        }catch (Exception e){
            e.printStackTrace();
        }
        int x = 10;
        if(x==10){
            throw  new RuntimeException("出错啦！");
        }
    }

    @Transactional(propagation= Propagation.MANDATORY)
    public void xiaodi(){
        ordersDao.reduceMoney();
        System.out.println("小弟的方法");
        int x =10;
        if(x==10){
            throw  new RuntimeException("出错啦！");
        }
    }
}
