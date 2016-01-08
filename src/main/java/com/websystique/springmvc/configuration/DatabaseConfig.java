package com.websystique.springmvc.configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@org.springframework.context.annotation.Configuration
@MapperScan("com.websystique.springmvc.dao.mapper")
public class DatabaseConfig {

	@Resource(mappedName = "jdbc/B0093983")
	private DataSource dataSource;

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		SqlSessionFactory factory= factoryBean.getObject();
		factory.getConfiguration().setMapUnderscoreToCamelCase(true);
		return factory;
	}
}