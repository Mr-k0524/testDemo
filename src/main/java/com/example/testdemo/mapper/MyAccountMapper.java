package com.example.testdemo.mapper;

import com.example.testdemo.model.Account;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyAccountMapper extends BaseMapper<Account> {
    Account selectByName(@Param("name") String name);
    @Select("select * from tb_account where id = #{id}")
    Account selectById(@Param("id") Object id);
}