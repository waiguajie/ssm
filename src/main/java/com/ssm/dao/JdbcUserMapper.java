package com.ssm.dao;

import com.ssm.model.JdbcUser;
import com.ssm.model.JdbcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JdbcUserMapper {
    int countByExample(JdbcUserExample example);

    int deleteByExample(JdbcUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JdbcUser record);

    int insertSelective(JdbcUser record);

    List<JdbcUser> selectByExample(JdbcUserExample example);

    JdbcUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JdbcUser record, @Param("example") JdbcUserExample example);

    int updateByExample(@Param("record") JdbcUser record, @Param("example") JdbcUserExample example);

    int updateByPrimaryKeySelective(JdbcUser record);

    int updateByPrimaryKey(JdbcUser record);
}