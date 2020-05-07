package com.xp.service;
import com.xp.entity.testBean;
import com.xp.oracle.mapper.testMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Author Yz
 * @Date 2020/4/28 15:58
 * @Company Atu
 * @Version 1.0
 **/
@Service
public class testServiceImpl implements testService {
  @Autowired
  private testMapper testMapper;

    @Override
    public List<testBean> getTestBean(){
        return testMapper.getTestBean();
    }
}
