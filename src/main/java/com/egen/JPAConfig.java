package com.egen;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class JPAConfig {

	@Bean
	public LocalContainerEntityManagerFactoryBean emf() {
		//TODO: configure emf
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		emf.setPackagesToScan("com.egen.model");
		emf.setJpaProperties(jpaProperties());
		return emf;
	}

	@Bean
	public DataSource dataSource() {
		//TODO: configure data source bean
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return  dataSource;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		//TODO: configure transaction manager
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		return transactionManager;
	}

	private Properties jpaProperties() {
		//TODO: configure jpa properties
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL81Dialect");
		properties.put("", "");
		properties.put("", "");
		return properties;
	}
}
