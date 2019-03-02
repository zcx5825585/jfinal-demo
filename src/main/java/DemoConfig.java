import com.zcx.jfinal.Controller.HelloController;
import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;
import com.zcx.jfinal.vo.Account;

/**
 * 类说明
 *
 * @author zcx
 * @version 创建时间：2019/2/28  16:49
 */
public class DemoConfig extends JFinalConfig{
    public static void main(String[] args) {
        UndertowServer.start(DemoConfig.class, 8085, true);
    }

    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setInjectDependency(true);
    }
    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
    }

    public void configEngine(Engine me) {}
    public void configPlugin(Plugins me) {
        DruidPlugin dp = new DruidPlugin("jdbc:mysql://127.0.0.1:3306/admin?characterEncoding=UTF-8&serverTimezone=GMT", "root", "sa123");
        me.add(dp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        me.add(arp);
        arp.addMapping("account", Account.class);
    }
    public void configInterceptor(Interceptors me) {}
    public void configHandler(Handlers me) {}
}
