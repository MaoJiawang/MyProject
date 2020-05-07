package com.xp.controller;

import com.Application;
import com.xp.entity.testBean;
import com.xp.service.testService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author Yz
 * @Date 2020/4/28 15:13
 * @Company Atu
 * @Version 1.0
 **/
@Controller
public class MainController {
    private final static Logger LOG = LoggerFactory.getLogger(Application.class);

    @Autowired
    private testService testService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        List<testBean> test = testService.getTestBean();
        LOG.info(String.valueOf(test.size()));
//
//        testBean testBean=new testBean();
//        testBean.set编码("HELLO");
//        model.addAttribute("testBean",testBean);
        return "index";
    }
}
