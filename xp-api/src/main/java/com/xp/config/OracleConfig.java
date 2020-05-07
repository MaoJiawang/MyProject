package com.xp.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.xp.oracle.mapper", sqlSessionFactoryRef = "oracleSqlSessionFactory")
public class OracleConfig {
  @Bean(name = "oracleDataSource")
  @Primary
  @ConfigurationProperties("spring.datasource.oral")
  public DataSource examDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean(name = "oracleSqlSessionFactory")
  @Primary
  public SqlSessionFactory sqlSessionFactory(@Qualifier("oracleDataSource") DataSource dataSource) throws Exception {
    SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
    sessionFactoryBean.setDataSource(dataSource);
    return sessionFactoryBean.getObject();
  }
}
