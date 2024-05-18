package com.ssafy.snapfit.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.ssafy.snapfit.model.dao")
@Configuration
public class MyBatisConfig {
 
}
