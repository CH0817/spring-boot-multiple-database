package tw.com.rex.springbootmultipledatabase.config;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"classpath:mapper/mariaDb/*.xml"})
public class MySqlConfig {

    @Bean(name = "mariaDbDataSource")
    @Primary
    @ConfigurationProperties("spring.datasource.mariadb")
    public DataSource mariaDbDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

}
