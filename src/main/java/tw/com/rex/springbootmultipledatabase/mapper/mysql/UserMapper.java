package tw.com.rex.springbootmultipledatabase.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.springbootmultipledatabase.model.dao.mysql.User;

import java.util.List;

@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}