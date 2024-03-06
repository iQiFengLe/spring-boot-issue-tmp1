package org.example;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * 数据库配置
 *
 * @author 起风了
 * @mail m.zxt@foxmail.com
 * @date 2023/11/22 20:05
 */
@Configuration
public class DbConfig {


    @Bean
    @ConfigurationProperties(value = "spring.datasource.log")
    public DataSource logDatasource(){
        return new DruidDataSource();
    }

    @Bean
    @ConfigurationProperties(value = "spring.datasource.user")
    public DataSource userDatasource(){
        return new DruidDataSource();
    }

}
