package com.cormen.bim.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by cormen on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.cormen.bim.mapper","com.cormen.bim.dao"})
public class MyBatisConfig {
}
