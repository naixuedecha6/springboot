package com.blog.weblogmodulecommon.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan("com.blog.weblogmodulecommon.domain.mapper")
public class MybatisPlusConfig {
}