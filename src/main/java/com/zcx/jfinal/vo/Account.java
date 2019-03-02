package com.zcx.jfinal.vo;

import com.jfinal.plugin.activerecord.Model;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2019/2/28  17:08
 */
public class Account extends Model<Account> {
    public static final Account dao = new Account().dao();
}
