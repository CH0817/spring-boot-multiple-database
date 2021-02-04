package tw.com.rex.springbootmultipledatabase.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tw.com.rex.springbootmultipledatabase.base.BaseTest;
import tw.com.rex.springbootmultipledatabase.model.dao.mariadb.Mobile;
import tw.com.rex.springbootmultipledatabase.model.dao.mysql.User;
import tw.com.rex.springbootmultipledatabase.service.BothService;

public class BothServiceTest extends BaseTest {

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
