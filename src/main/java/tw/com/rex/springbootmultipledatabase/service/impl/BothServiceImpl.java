package tw.com.rex.springbootmultipledatabase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.rex.springbootmultipledatabase.mapper.mariadb.MobileMapper;
import tw.com.rex.springbootmultipledatabase.mapper.mysql.UserMapper;
import tw.com.rex.springbootmultipledatabase.model.dao.mariadb.Mobile;
import tw.com.rex.springbootmultipledatabase.model.dao.mysql.User;
import tw.com.rex.springbootmultipledatabase.service.BothService;

@Service
@Transactional
public class BothServiceImpl implements BothService {

    private UserMapper userMapper;
    private MobileMapper mobileMapper;

    @Autowired
    public BothServiceImpl(UserMapper userMapper, MobileMapper mobileMapper) {
        this.userMapper = userMapper;
        this.mobileMapper = mobileMapper;
    }

    @Override
    public void insert(User user, Mobile mobile) {
        insertUser(user);
        insertMobile(mobile);
        int i = 1 / 0;
    }

    private void insertUser(User user) {
        userMapper.insert(user);
    }

    private void insertMobile(Mobile mobile) {
        mobileMapper.insert(mobile);
    }

}
