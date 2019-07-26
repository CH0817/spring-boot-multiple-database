package tw.com.rex.springbootmultipledatabase.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import tw.com.rex.springbootmultipledatabase.model.dao.mariadb.Mobile;
import tw.com.rex.springbootmultipledatabase.model.dao.mysql.User;
import tw.com.rex.springbootmultipledatabase.service.BothService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class BothServiceTest {

    @Autowired
    private BothService service;

    @Test(expected = ArithmeticException.class)
    public void insert() {
        User user = new User();
        user.setName("XD");
        Mobile mobile = new Mobile();
        mobile.setMobile("0912345678");
        service.insert(user, mobile);
    }

}
