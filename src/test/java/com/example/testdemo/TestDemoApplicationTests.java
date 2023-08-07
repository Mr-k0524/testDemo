package com.example.testdemo;

import com.example.testdemo.model.Account;
import com.example.testdemo.mapper.AccountMapper;
import com.example.testdemo.mapper.MyAccountMapper;
import com.example.testdemo.model.ArticleDTO;
import com.mybatisflex.core.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.testdemo.model.table.AccountTableDef.ACCOUNT;

@SpringBootTest
class TestDemoApplicationTests {

    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private MyAccountMapper myAccountMapper;
    @Test

    void contextLoads() {
//        Account account = myAccountMapper.selectById(1);
        Account account = myAccountMapper.selectByName("张三");

//        QueryWrapper queryWrapper=QueryWrapper.create()
//                .select()
//                .where(ACCOUNT.AGE.eq(18));
//        Account account = accountMapper.selectOneByQuery(queryWrapper);
//        QueryWrapper queryWrapper=QueryWrapper.create()
//                        .select(ARTICLEDTD)
        System.out.println(account);
    }

}
