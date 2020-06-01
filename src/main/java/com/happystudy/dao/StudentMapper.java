package com.happystudy.dao;

import com.happystudy.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    public List<Student> queryStudent (String keyword,String orderBy,String orderWay,Integer pageOffset,Integer pageSize);

}
