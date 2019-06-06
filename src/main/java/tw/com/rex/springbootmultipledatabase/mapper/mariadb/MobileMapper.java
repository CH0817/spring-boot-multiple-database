package tw.com.rex.springbootmultipledatabase.mapper.mariadb;

import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.springbootmultipledatabase.model.dao.mariadb.Mobile;

import java.util.List;

@Mapper
public interface MobileMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Mobile record);

    Mobile selectByPrimaryKey(Integer id);

    List<Mobile> selectAll();

    int updateByPrimaryKey(Mobile record);
}