package tw.com.rex.springbootmultipledatabase.mapper.mariadb;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tw.com.rex.springbootmultipledatabase.base.BaseTest;
import tw.com.rex.springbootmultipledatabase.model.dao.mariadb.Mobile;
import tw.com.rex.springbootmultipledatabase.service.MariaDbService;

/**
 * 配置多資料庫無法使用 @MybatisTest 做測試
 * 因為 @MybatisTest  會使用預設的 DataSource 而不是使用自訂的
 */
public class MariaDbServiceTest extends BaseTest {

    @Autowired
    private MariaDbService mapper;

    @Test
    public void insert() {
        Mobile entity = new Mobile();
        entity.setMobile("test");
        mapper.insert(entity);
    }

}
