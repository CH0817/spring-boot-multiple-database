package tw.com.rex.springbootmultipledatabase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
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
        int insert = userMapper.insert(user);
        mobileMapper.insert(mobile);
        // 此處會發生 exception 但是 MobileMapper 不是主要的 datasource (@Primary)
        // 所以只有 UserMapper 會 roll back
        Assert.isTrue(insert == 0, "insert is not 0");
    }
}
