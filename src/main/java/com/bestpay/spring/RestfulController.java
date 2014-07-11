package com.bestpay.spring;

//import com.bestpay.springmvc.center.db.DBManager;
//import com.bestpay.springmvc.center.vo.User;
import com.bestpay.spring.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Desc:功能性描述
 * User: xiechao
 * Date: 14-6-5
 * Time: 上午11:27
 * 版权所有 中国电信天翼电子商务有限公司
 */
@Controller
@RequestMapping(value = {"/easyPay"})
public class RestfulController {

    @PostConstruct
    public void init(){
        System.out.println("init.....");
    }
   //@Autowired
   //private DBManager dbManager;
    /**　列表　*/
    @RequestMapping(value ={"/userInfo.action", "/userInfo.do"},method = RequestMethod.POST)
    public ModelAndView index(HttpServletRequest request,
                              HttpServletResponse response,User user){
     //List<User> list = dbManager.queryAll();
        User u = new User();
        u.setName("testlink");
        u.setSex("女");
        u.setAge("25");
        u.setTitle("厨师");
       List<User> list =  new ArrayList<User>();
        list.add(u);
     return new ModelAndView("list","userList",list);
    }

}
