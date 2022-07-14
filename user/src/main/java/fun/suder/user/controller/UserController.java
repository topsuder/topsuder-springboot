package fun.suder.user.controller;

import fun.suder.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Copyright: Copyright (c) 2022 版权</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * @DATE 2022/7/14-11:02
 * @Description
 * @see fun.suder.user.controller topsuder-springboot
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String test(){
        return userService.test();
    }
}