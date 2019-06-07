package tw.com.rex.springbootmultipledatabase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.com.rex.springbootmultipledatabase.mapper.mysql.UserMapper;
import tw.com.rex.springbootmultipledatabase.model.dao.mysql.User;
import tw.com.rex.springbootmultipledatabase.service.MySqlService;

@Service
public class MySqlServiceImpl implements MySqlService {

    private UserMapper mapper;

    @Autowired
    public MySqlServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void insert(User user) {
        mapper.insert(user);
    }
}
