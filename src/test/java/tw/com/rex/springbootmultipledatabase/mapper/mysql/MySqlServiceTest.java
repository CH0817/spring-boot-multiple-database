package tw.com.rex.springbootmultipledatabase.mapper.mysql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tw.com.rex.springbootmultipledatabase.model.dao.mysql.User;
import tw.com.rex.springbootmultipledatabase.service.MySqlService;

/**
 * 配置多資料庫無法使用 @MybatisTest 做測試
 * 因為 @MybatisTest  會使用預設的 DataSource 而不是使用自訂的
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MySqlServiceTest {

    @Autowired
    private MySqlService service;

    @Test
    public void insert() {
        User entity = new User();
        entity.setName("XD");
        service.insert(entity);
    }

}
