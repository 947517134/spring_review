package com.service;

import com.dao.Userdao;
import com.dao.UserdaoImpl;
import com.dao.UserdaoMysqlImpl;
import com.dao.UserdaoOracleImpl;

public class UserserviceImpl implements Userservice {
//    Userdao userdao = new UserdaoImpl();
//    Userdao userdao = new UserdaoMysqlImpl();
//    Userdao userdao = new UserdaoOracleImpl();

     Userdao userdao;

    public void setUserdao(Userdao userdao) {
        this.userdao = userdao;
    }

    public void getUser() {
        userdao.getUser();
    }
}
