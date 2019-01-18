package com.windlazio.study.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;
    private String username;

    @Override
    public String execute() throws Exception {
        if(username.equals("admin") && password.equals("admin"))
            return "SUCCESS";
        else
            return "FAIL";
    }
}
