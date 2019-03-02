package com.zcx.jfinal.service;

import com.jfinal.aop.Singleton;
import com.zcx.jfinal.vo.Account;

import java.util.List;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2019/2/28  16:58
 */
@Singleton(true)
public class DemoService {
    public List<Account> test() {
        List<Account> accounts = new Account().find("select * from account");
        return accounts;
    }
}
