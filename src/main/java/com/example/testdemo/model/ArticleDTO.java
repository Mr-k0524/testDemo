package com.example.testdemo.model;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table("tb_article")
public class ArticleDTO {

    @Id(keyType = KeyType.Auto)
    private Long id;
    private Long accountId;
    private String title;
    private String content;

    //以下用户相关字段
    private String userName;
    private int age;
    private Date birthday;
}
