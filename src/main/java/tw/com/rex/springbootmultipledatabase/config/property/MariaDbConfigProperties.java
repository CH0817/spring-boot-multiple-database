package tw.com.rex.springbootmultipledatabase.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:mariadb-config.properties")
@ConfigurationProperties(prefix = "datasource.mariadb")
public class MariaDbConfigProperties {

    private String xaDataSourceClassName;
    private final XaProperties xaProperties = new XaProperties();

    public String getXaDataSourceClassName() {
        return xaDataSourceClassName;
    }

    public void setXaDataSourceClassName(String xaDataSourceClassName) {
        this.xaDataSourceClassName = xaDataSourceClassName;
    }

    public XaProperties getXaProperties() {
        return xaProperties;
    }

    public static class XaProperties {

        private String url;
        private String user;
        private String password;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }

}
