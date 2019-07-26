package tw.com.rex.springbootmultipledatabase.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"tw.com.rex.springbootmultipledatabase.mapper.mariadb"},
            sqlSessionTemplateRef = "mariadbSqlSessionTemplate")
public class MariaDbConfig {

    @Bean(name = "mariaDbDataSource")
    @ConfigurationProperties("datasource.mariadb")
    public DataSource mariaDbDataSource() {
        return new AtomikosDataSourceBean();
        // return DataSourceBuilder.create().build();
    }

    // @Bean(name = "mariadbTransactionManager")
    // public DataSourceTransactionManager masterTransactionManager(
    //         @Qualifier("mariaDbDataSource") DataSource mariaDbDataSource) {
    //     return new DataSourceTransactionManager(mariaDbDataSource);
    // }

    @Bean(name = "mariadbSqlSessionFactory")
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("mariaDbDataSource") DataSource mariaDbDataSource)
            throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(mariaDbDataSource);
        sessionFactory.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath:mapper/mariadb/*.xml"));
        return sessionFactory.getObject();
    }

    @Bean(name = "mariadbSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(
            @Qualifier("mariadbSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
