package fun.suder.user.service.impl;

import fun.suder.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Copyright: Copyright (c) 2022 版权</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * @DATE 2022/7/14-11:03
 * @Description
 * @see fun.suder.user.service.impl topsuder-springboot
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String test() {
        return "测试的提供者";
    }
}
