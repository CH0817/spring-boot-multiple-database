package tw.com.rex.springbootmultipledatabase.mapper.mysql;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tw.com.rex.springbootmultipledatabase.base.BaseTest;
import tw.com.rex.springbootmultipledatabase.model.dao.mysql.User;
import tw.com.rex.springbootmultipledatabase.service.MySqlService;

/**
 * 配置多資料庫無法使用 @MybatisTest 做測試
 * 因為 @MybatisTest  會使用預設的 DataSource 而不是使用自訂的
 */
public class MySqlServiceTest extends BaseTest {

    @Autowired
    private MySqlService service;

    @Test
    public void insert() {
        User entity = new User();
        entity.setName("XD");
        service.insert(entity);
    }

}
