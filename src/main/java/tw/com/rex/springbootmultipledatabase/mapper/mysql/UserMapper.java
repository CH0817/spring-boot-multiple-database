package tw.com.rex.springbootmultipledatabase.mapper.mysql;

import java.util.List;
import tw.com.rex.springbootmultipledatabase.model.dao.mysql.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}