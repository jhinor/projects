package com.github.jhinor.authority;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @author shiyu.long
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.github.jhinor.authority", excludeFilters = @ComponentScan.Filter(Controller.class))
@EnableJpaRepositories("com.github.jhinor.authority.repository")
public class InfrastructureConf {

    /**
     * use memory data base
     *
     * @return {@link DataSource }
     */
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("SA");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:hsqldb:hsql://localhost:3306/db");
        dataSource.setMinIdle(5);
        dataSource.setMaxActive(20);
        dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
        dataSource.setTestWhileIdle(true);
        dataSource.setValidationQuery("SELECT * FROM INFORMATION_SCHEMA.SYSTEM_TYPEINFO");

//        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//        return builder.setType(EmbeddedDatabaseType.HSQL).setName(CONSTANT.DB.DB_NAME).setScriptEncoding("UTF-8").build();
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(true);
        jpaVendorAdapter.setShowSql(true);
        jpaVendorAdapter.setDatabase(Database.HSQL);
        return jpaVendorAdapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(JpaVendorAdapter jpaVendorAdapter, DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter);
        entityManagerFactory.setDataSource(dataSource);
        entityManagerFactory.setPackagesToScan(getClass().getPackage().getName());
        return entityManagerFactory;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
        return jpaTransactionManager;
    }


}
