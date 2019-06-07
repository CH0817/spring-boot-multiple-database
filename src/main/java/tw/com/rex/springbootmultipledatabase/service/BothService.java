package tw.com.rex.springbootmultipledatabase.service;

import tw.com.rex.springbootmultipledatabase.model.dao.mariadb.Mobile;
import tw.com.rex.springbootmultipledatabase.model.dao.mysql.User;

public interface BothService {

    void insert(User user, Mobile mobile);

}
