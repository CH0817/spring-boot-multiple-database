package tw.com.rex.springbootmultipledatabase.mapper.mariadb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tw.com.rex.springbootmultipledatabase.model.dao.mariadb.Mobile;
import tw.com.rex.springbootmultipledatabase.service.MariaDbService;

/**
 * 配置多資料庫無法使用 @MybatisTest 做測試
 * 因為 @MybatisTest  會使用預設的 DataSource 而不是使用自訂的
 */
@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MariaDbServiceTest {

    @Autowired
    private MariaDbService mapper;

    @Test
    public void insert() {
        Mobile entity = new Mobile();
        entity.setMobile("test");
        mapper.insert(entity);
    }

}
