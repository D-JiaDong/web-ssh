package com.gyf.itedu.web.action;

import com.gyf.itedu.model.User;
import com.gyf.itedu.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;

public class UserAction extends ActionSupport implements ModelDriven<User>{

    private User user = new User();

    /**
     * 在action中使用Service注意：
     * 1.不需要在spring的配置文件中注入service
     * 2.会根据spring中的id的名字注入到当前属性中
     * 3.在action中service要提供set方法
     */
    private IUserService userService;

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String register(){
        //获取请求参数
        System.out.println(user);

        //调用Service
        userService.register(user);

        //返回结果
        return SUCCESS;
    }
    public String gologin(){
        return SUCCESS;
    }

    public String login(){
        //获取请求参数
        System.out.println(user);

        //调用Service
        int isexist=userService.login(user);

        //返回结果
        if (isexist>0)
            return SUCCESS;
        else
            return ERROR;
    }

    @Override
    public User getModel() {
        return user;
    }
}
