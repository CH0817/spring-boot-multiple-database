package tw.com.rex.springbootmultipledatabase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.com.rex.springbootmultipledatabase.mapper.mariadb.MobileMapper;
import tw.com.rex.springbootmultipledatabase.model.dao.mariadb.Mobile;
import tw.com.rex.springbootmultipledatabase.service.MariaDbService;

@Service
public class MariaDbServiceImpl implements MariaDbService {

    private MobileMapper mapper;

    @Autowired
    public MariaDbServiceImpl(MobileMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void insert(Mobile mobile) {
        mapper.insert(mobile);
    }
}
