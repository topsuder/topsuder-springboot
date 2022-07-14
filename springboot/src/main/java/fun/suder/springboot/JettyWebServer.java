package fun.suder.springboot;

/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Copyright: Copyright (c) 2022 版权</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * @DATE 2022/7/14-20:10
 * @Description
 * @see fun.suder.springboot topsuder-springboot
 */
public class JettyWebServer implements WebServer {
    @Override
    public void start() {
        System.out.println("JettyWebServer start");
    }
}

