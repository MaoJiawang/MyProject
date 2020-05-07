package com.xp.service;

import com.xp.entity.testBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface testService {
    /**
     * 测试
     */
    List<testBean> getTestBean();

}
