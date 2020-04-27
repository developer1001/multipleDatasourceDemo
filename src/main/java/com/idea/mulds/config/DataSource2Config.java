package com.idea.mulds.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
/**
 * 数据源2
 * @date 2020-04-27 16:29:48
 * @author yang
 */
@Configuration
@MapperScan(basePackages = "com.idea.mulds.persistent.persistent2.dao", sqlSessionTemplateRef = "sqlSessionTemplate2")
public class DataSource2Config {
	@Value("${spring.mybatis2.mapperLocations}")
	private String mapperLocations;
	@Bean(name = "dataSource2")
	@ConfigurationProperties(prefix = "spring.datasource2")
	public DataSource testDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean(name = "sqlSessionFactory2")
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("dataSource2") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources(mapperLocations));
		return bean.getObject();
	}

	@Bean(name = "transactionManager2")
	public DataSourceTransactionManager testTransactionManager(@Qualifier("dataSource2") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "sqlSessionTemplate2")
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("sqlSessionFactory2") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
