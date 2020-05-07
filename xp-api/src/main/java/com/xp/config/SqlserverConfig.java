package com.xp.config;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.xp.sqlserver.mapper", sqlSessionFactoryRef = "sqlServerSqlSessionFactory")
public class SqlserverConfig {
  // @Primary
  @Bean(name = "sqlServerDataSource")
  @ConfigurationProperties("spring.datasource.sqlser")
  public DataSource inspectDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean(name = "sqlServerSqlSessionFactory")
  public SqlSessionFactory sqlSessionFactory(@Qualifier("sqlServerDataSource") DataSource dataSource) throws Exception {
    SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
    sessionFactoryBean.setDataSource(dataSource);
    return sessionFactoryBean.getObject();
  }

}
