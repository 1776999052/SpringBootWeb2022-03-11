package com.example.mapper;

import com.example.entry.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface MainMapper {
    @Select("select * from users where username = #{username}")
    Student findUserByName(String username);



}
