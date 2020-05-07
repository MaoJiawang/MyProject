package com.xp.oracle.mapper;
import com.xp.entity.testBean;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface testMapper {

    List<testBean> getTestBean();
}
