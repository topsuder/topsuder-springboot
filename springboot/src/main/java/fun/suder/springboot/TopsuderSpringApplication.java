package fun.suder.springboot;

import org.apache.catalina.Context;
import org.apache.catalina.Engine;
import org.apache.catalina.Host;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Server;
import org.apache.catalina.Service;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.Map;

/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Copyright: Copyright (c) 2022 版权</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * @DATE 2022/7/14-11:09
 * @Description
 * @see fun.suder.springboot topsuder-springboot
 */
public class TopsuderSpringApplication {

    public static void run(Class clazz){
        //创建一个spring容器
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(clazz);
        applicationContext.refresh();

        WebServer webServer = getWebServer(applicationContext);

    }

    private static WebServer getWebServer(AnnotationConfigWebApplicationContext applicationContext) {

        final Map<String, WebServer> beansOfType = applicationContext.getBeansOfType(WebServer.class);

        if (beansOfType.size() == 0) {
            throw new IllegalArgumentException("No WebServer bean found");
        }
        if (beansOfType.size() > 1) {
            throw new IllegalArgumentException("More than one WebServer bean found");
        }
        return beansOfType.values().iterator().next();


    }

}
