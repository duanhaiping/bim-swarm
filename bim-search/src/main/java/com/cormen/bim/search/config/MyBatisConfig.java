package com.cormen.bim.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by cormen on 2019/4/8.
 */
@Configuration
@MapperScan({"com.cormen.bim.mapper","com.cormen.bim.search.dao"})
public class MyBatisConfig {
}
