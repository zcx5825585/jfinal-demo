package com.zcx.jfinal.Controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.zcx.jfinal.service.DemoService;
import com.zcx.jfinal.vo.Account;

import java.util.List;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2019/2/28  16:50
 */
public class HelloController extends Controller {
    @Inject
    private DemoService demoService;
    public void index() {
        renderText("Hello JFinal World.");
    }

    public void findAll() {
        List<Account> test=demoService.test();
        renderJson(test);
    }
}
