package fun.suder.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Copyright: Copyright (c) 2022 版权</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * @DATE 2022/7/14-20:23
 * @Description
 * @see fun.suder.springboot topsuder-springboot
 */
@Configuration
public class WebServiceAutoConfiguration {

    @Bean
    @TopsuderConditionalOnClass(value = "com.apache.catalina.startup.Tomcat")
    public TomcatWebServer tomcatWebServer(){
        return new TomcatWebServer();
    }

    @Bean
    @TopsuderConditionalOnClass(value = "org.eclipse.jetty.server.Server")
    public JettyWebServer jettyWebServer(){
        return new JettyWebServer();
    }

}
